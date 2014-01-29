package fi.softala.jee.demo.d11.kello;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

/**
 * Hankkii aikatiedon internetistä palvelimelta time-a.nist.gov
 */
public class InternetKelloLahde implements KelloLahde {

	public Date haeAjanhetki() {
		String palvelin = "time-a.nist.gov";   
        NTPUDPClient client = new NTPUDPClient();
        InetAddress osoite;
        TimeInfo aikatieto;
		try {
			osoite = InetAddress.getByName(palvelin);
			aikatieto = client.getTime(osoite);
		} catch (UnknownHostException e) {
			throw new RuntimeException("aikapalvelimen osoitetta ei pystytty selvittämään",e);
		} catch (IOException e) {
			throw new RuntimeException("aikatietoa ei kyetty noutamaan internetistä", e);
		}
        long millisekunnitEpochista = aikatieto.getReturnTime();
        Date ajanhetki = new Date(millisekunnitEpochista);
		return ajanhetki;
	}

}
