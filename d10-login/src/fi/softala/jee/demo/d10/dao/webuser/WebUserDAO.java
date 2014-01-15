package fi.softala.jee.demo.d10.dao.webuser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import fi.softala.jee.demo.d10.bean.WebUser;
import fi.softala.jee.demo.d10.dao.DAOPoikkeus;
import fi.softala.jee.demo.d10.dao.DBConnectionProperties;

public class WebUserDAO {

	public WebUserDAO() throws DAOPoikkeus {
		try {
			Class.forName(
					DBConnectionProperties.getInstance().getProperty("driver"))
					.newInstance();
		} catch (Exception e) {
			throw new DAOPoikkeus("Tietokannan ajuria ei kyetty lataamaan.", e);
		}
	}

	/**
	 * Avaa tietokantayhteyden
	 * 
	 * @return avatun tietokantayhteyden
	 * @throws Exception
	 *             Mikäli yhteyden avaaminen ei onnistu
	 */
	private Connection avaaYhteys() throws DAOPoikkeus {

		try {
			return DriverManager.getConnection(DBConnectionProperties
					.getInstance().getProperty("url"), DBConnectionProperties
					.getInstance().getProperty("username"),
					DBConnectionProperties.getInstance()
							.getProperty("password"));
		} catch (Exception e) {
			throw new DAOPoikkeus("Tietokantayhteyden avaaminen epäonnistui", e);
		}
	}

	/**
	 * Sulkee tietokantayhteyden
	 * 
	 * @param yhteys
	 *            Suljettava yhteys
	 */
	private void suljeYhteys(Connection yhteys) throws DAOPoikkeus {
		try {
			if (yhteys != null && !yhteys.isClosed())
				yhteys.close();
		} catch (Exception e) {
			throw new DAOPoikkeus(
					"Tietokantayhteys ei jostain syystä suostu menemään kiinni.",
					e);
		}
	}

	/**
	 * Lisää uuden webuserin tietokantaan
	 * 
	 * @param kayttaja
	 *            uuden webuserin tiedot
	 * @throws UsernameVarattuPoikkeus
	 *             Mikäli tietokannasta löytyy jo käyttäjä samalla usernamella
	 * @throws DAOPoikkeus
	 *             Mikäli tietokantahaussa tapahtuu virhe
	 */
	public void lisaa(WebUser kayttaja) throws UsernameVarattuPoikkeus,
			DAOPoikkeus {
		Connection yhteys = avaaYhteys();

		try {

			// tarkistetaan, että usernamella ei jo löydy käyttäjää
			PreparedStatement usernameHaku = yhteys
					.prepareStatement("select id from webuser where username = ?");
			usernameHaku.setString(1, kayttaja.getUsername());
			ResultSet rs = usernameHaku.executeQuery();
			if (rs.next())
				throw new UsernameVarattuPoikkeus();

			// suoritetaan lisäys
			PreparedStatement insertLause = yhteys
					.prepareStatement("insert into webuser(username, password_hash, salt) values(?,?,?)");
			insertLause.setString(1, kayttaja.getUsername());
			insertLause.setString(2, kayttaja.getPasswordHash());
			insertLause.setString(3, kayttaja.getSalt());

			insertLause.executeUpdate();

		} catch (SQLException e) {
			// JOTAIN VIRHETTÄ TAPAHTUI
			throw new DAOPoikkeus("Tietokantahaku aiheutti virheen", e);
		} finally {
			// LOPULTA AINA SULJETAAN YHTEYS
			suljeYhteys(yhteys);
		}

	}

	public WebUser hae(String username) throws DAOPoikkeus {
		WebUser kayttaja;
		Connection yhteys = avaaYhteys();

		try {

			// tarkistetaan, että usernamella ei jo löydy käyttäjää
			PreparedStatement usernameHaku = yhteys
					.prepareStatement("select id, username, salt, password_hash from webuser where username = ?");
			usernameHaku.setString(1, username);
			ResultSet rs = usernameHaku.executeQuery();
			if (rs.next()) {
				// LÖYTYI
				kayttaja = new WebUser(rs.getInt("id"),
						rs.getString("username"), rs.getString("salt"),
						rs.getString("password_hash"));
			} else {
				// EI LÖYTYNYT
				// generoidaan kuitenkin tyhjä user, jotta 
				// login tarkistus kestää aina yhtä kauan
				kayttaja = new WebUser(-1, "-", "-", "-");
			}

		} catch (SQLException e) {
			// JOTAIN VIRHETTÄ TAPAHTUI
			throw new DAOPoikkeus("Tietokantahaku aiheutti virheen", e);
		} finally {
			// LOPULTA AINA SULJETAAN YHTEYS
			suljeYhteys(yhteys);
		}
		return kayttaja;
	}

}
