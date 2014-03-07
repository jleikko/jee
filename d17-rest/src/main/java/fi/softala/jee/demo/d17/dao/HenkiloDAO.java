package fi.softala.jee.demo.d17.dao;

import java.util.List;

import fi.softala.jee.demo.d17.bean.Henkilo;

public interface HenkiloDAO {

	public abstract void talleta(Henkilo henkilo);

	public abstract Henkilo etsi(int id);

	public abstract List<Henkilo> haeKaikki();

}