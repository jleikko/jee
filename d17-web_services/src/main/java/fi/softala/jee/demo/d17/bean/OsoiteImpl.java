package fi.softala.jee.demo.d17.bean;

public class OsoiteImpl implements Osoite {
	private int id;
	private String nimi;
	private String katuosoite;
	private String postinumero;
	private String postitoimipaikka;
	private String osavaltio;
	private String maa;

	public OsoiteImpl() {
		super();
	}

	public OsoiteImpl(int id, String nimi, String katuosoite,
			String postinumero, String postitoimipaikka, String osavaltio,
			String maa) {
		super();
		this.id = id;
		this.nimi = nimi;
		this.katuosoite = katuosoite;
		this.postinumero = postinumero;
		this.postitoimipaikka = postitoimipaikka;
		this.osavaltio = osavaltio;
		this.maa = maa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getKatuosoite() {
		return katuosoite;
	}

	public void setKatuosoite(String katuosoite) {
		this.katuosoite = katuosoite;
	}

	public String getPostinumero() {
		return postinumero;
	}

	public void setPostinumero(String postinumero) {
		this.postinumero = postinumero;
	}

	public String getPostitoimipaikka() {
		return postitoimipaikka;
	}

	public void setPostitoimipaikka(String postitoimipaikka) {
		this.postitoimipaikka = postitoimipaikka;
	}

	public String getOsavaltio() {
		return osavaltio;
	}

	public void setOsavaltio(String osavaltio) {
		this.osavaltio = osavaltio;
	}

	public String getMaa() {
		return maa;
	}

	public void setMaa(String maa) {
		this.maa = maa;
	}

	@Override
	public String toString() {
		return id + ";" + nimi + ";" + katuosoite + ";" + postinumero + ";"
				+ postitoimipaikka + ";" + osavaltio + ";" + maa;
	}
}
