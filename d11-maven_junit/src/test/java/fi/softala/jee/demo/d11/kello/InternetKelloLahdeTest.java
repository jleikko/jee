package fi.softala.jee.demo.d11.kello;

import java.util.Date;

import org.junit.Test;

import static org.junit.Assert.*;

public class InternetKelloLahdeTest {

	@Test
	public void testHaeAika() {
		Date ajanhetki = new InternetKelloLahde().haeAjanhetki();
		assertNotNull(ajanhetki);
		
		/* testi voi kaatua myös exceptioniin, jos esimerkiksi nettiyhteys ei toimi
		 * tai aikapalvelin ei ole saatavilla 
		 */
	}

}
