package fi.softala.jee.demo.d17.bean;

public interface Osoite {
	public int getId();
	public void setId(int id);
	public String getNimi();
	public void setNimi(String nimi);
	public String getKatuosoite();
	public void setKatuosoite(String katuosoite);
	public String getPostinumero();
	public void setPostinumero(String postinumero);
	public String getPostitoimipaikka();
	public void setPostitoimipaikka(String postitoimipaikka);
	public String getOsavaltio();
	public void setOsavaltio(String osavaltio);
	public String getMaa();
	public void setMaa(String maa);
}
