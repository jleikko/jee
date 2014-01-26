package fi.softala.jee.demo.d10.dao.webuser;

public class UsernameVarattuPoikkeus extends Exception {

	private static final long serialVersionUID = 1L;

	public UsernameVarattuPoikkeus() {
		super("Username on jo varattuna jollain toisella käyttäjällä tietokannassa.");
	}
}
