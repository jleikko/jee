package fi.softala.jee.demo.d17.dao;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import fi.softala.jee.demo.d17.bean.Osoite;

public class OsoiteWrapper {
	@JsonDeserialize(contentAs = OsoiteDAO.class)
	private List<Osoite> osoitteet = new ArrayList<Osoite>(); // Mapping error
																// if different
																// name than the
																// object name

	public List<Osoite> getOsoitteet() {
		return osoitteet;
	}

	public void setOsoitteet(List<Osoite> osoitteet) {
		this.osoitteet = osoitteet;
	}

}
