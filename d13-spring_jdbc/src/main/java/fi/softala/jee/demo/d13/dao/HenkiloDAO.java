package fi.softala.jee.demo.d13.dao;

import java.util.List;

import fi.softala.jee.demo.d13.bean.Henkilo;
import fi.softala.jee.demo.d13.bean.HenkiloVanha;

public interface HenkiloDAO {

	public abstract void talleta(HenkiloVanha henkilo);

	public abstract Henkilo etsi(int id);

	public abstract List<Henkilo> haeKaikki();

}