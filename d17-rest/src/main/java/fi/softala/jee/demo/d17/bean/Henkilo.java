package fi.softala.jee.demo.d17.bean;

public interface Henkilo {

	public abstract int getId();

	public abstract void setId(int id);

	public abstract String getEtunimi();

	public abstract void setEtunimi(String etunimi);

	public abstract String getSukunimi();

	public abstract void setSukunimi(String sukunimi);
	
	public abstract String getSahkoposti();
	
	public abstract void setSahkoposti(String sahkoposti);
	
	public abstract String getLahiosoite();
	
	public abstract void setLahiosoite(String lahiosoite);
	
	public abstract String getPostinumero();
	
	public abstract void setPostinumero(String postinumero);
	
	public abstract String getPostitoimipaikka();
	
	public abstract void setPostitoimipaikka(String postitoimipaikka);

}