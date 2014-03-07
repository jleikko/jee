package fi.softala.jee.demo.d17.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.softala.jee.demo.d17.bean.Henkilo;
import fi.softala.jee.demo.d17.bean.HenkiloImpl;

public class HenkiloRowMapper implements RowMapper<Henkilo> {

	public Henkilo mapRow(ResultSet rs, int rowNum) throws SQLException {
		Henkilo h = new HenkiloImpl();
		h.setEtunimi(rs.getString("etunimi"));
		h.setSukunimi(rs.getString("sukunimi"));
		h.setId(rs.getInt("id"));
		h.setSahkoposti(rs.getString("sahkoposti"));
		h.setLahiosoite(rs.getString("lahiosoite"));
		h.setPostinumero(rs.getString("postinumero"));
		h.setPostitoimipaikka(rs.getString("postitoimipaikka"));
		
		return h;
	}

}
