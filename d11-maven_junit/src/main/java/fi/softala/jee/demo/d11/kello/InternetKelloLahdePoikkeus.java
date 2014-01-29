package fi.softala.jee.demo.d11.kello;

public class InternetKelloLahdePoikkeus extends RuntimeException {
	
	public InternetKelloLahdePoikkeus(String viesti, Throwable poikkeus) {
		super(viesti, poikkeus);
	}

}
