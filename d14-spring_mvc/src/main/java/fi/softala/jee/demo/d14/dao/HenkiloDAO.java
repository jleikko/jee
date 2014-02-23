package fi.softala.jee.demo.d14.dao;

import java.util.List;

import fi.softala.jee.demo.d14.bean.Henkilo;

public interface HenkiloDAO {

	public abstract void talleta(Henkilo henkilo);

	public abstract Henkilo etsi(int id);

	public abstract List<Henkilo> haeKaikki();

}