package fi.softala.jee.demo.d14.dao;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class HenkiloaEiLoydyPoikkeus extends RuntimeException {

	public HenkiloaEiLoydyPoikkeus(Exception cause) {
		super(cause);
	}
	
}