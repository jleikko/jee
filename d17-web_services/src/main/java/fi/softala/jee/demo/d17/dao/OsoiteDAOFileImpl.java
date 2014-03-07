package fi.softala.jee.demo.d17.dao;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import fi.softala.jee.demo.d17.bean.Osoite;
import fi.softala.jee.demo.d17.bean.OsoiteImpl;

public class OsoiteDAOFileImpl implements OsoiteDAO {

	public void talleta(OsoiteImpl osoite) {

		File tiedosto = new File("osoitteet.csv");
		try {
			PrintWriter tulostus = new PrintWriter(new FileWriter(tiedosto,
					true));
			tulostus.println(osoite);
			tulostus.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Osoite> haeKaikki() {

		/*
1;Sakari ja Leila Lukkarinen;Ojahaantie 8 B 28;01600;Vantaa;Uusimaa;FINLAND
2;Minna ja Mikko Minkkinen;Lauttasaarentie 38 C 26;00200;Helsinki;Uusimaa;FINLAND
3;Kirsi Makkonen perheineen;Akselinkatu 3 B 11;57130;Savonlinna;Karjala;FINLAND
4;Wayne and Tammy Cooke;11 Pinerock DR.;29690;Travelers Rst;SC;USA
5;Tuija Auvinen;Lehikuja 10;13720;Parola;Hame;FINLAND
6;Sami Itkonen;Maenrinne 3-5 L 99;02160;Helsinki;Uusimaa;FINLAND
7;Jane and Bill Helling;301 N. Grace Ave.;47933;Crawfordsville;IN;USA
8;Simo ja Kaija Pihamaki;Korventie 281;05100 Roykka;Uusimaa;FINLAND
		 */

		ArrayList<Osoite> osoitteet = new ArrayList<Osoite>();

		Osoite osoite1 = new OsoiteImpl(1, "Pekka ja Maija Pakarinen",
				"Jokihaantie 8 B 28", "01600", "Vantaa", "Uusimaa", "FINLAND");
		Osoite osoite2 = new OsoiteImpl(2, "Niina ja Pentti Koiranen",
				"Lauttasaarentie 38 C 26", "00200", "Helsinki", "Uusimaa", "FINLAND");
		Osoite osoite3 = new OsoiteImpl(3, "Tiina Savolainen perheineen",
				"Akselinkatu 3 B 11", "01600", "Savonlinna", "Uusimaa", "FINLAND");
		Osoite osoite4 = new OsoiteImpl(4, "Mark and Nina Lewis",
				"Pinerock DR", "29690", "Cambridge", "SC", "USA");
		Osoite osoite5 = new OsoiteImpl(5, "Raija Lemmetty",
				"Jokihaantie 8 B 28", "01600", "Vantaa", "Uusimaa", "FINLAND");
		Osoite osoite6 = new OsoiteImpl(6, "Panu Putkonen",
				"Jokihaantie 8 B 28", "01600", "Helsinki", "Uusimaa", "FINLAND");
		Osoite osoite7 = new OsoiteImpl(7, "Pekka ja Maija Pakarinen",
				"Jokihaantie 8 B 28", "01600", "Vantaa", "IN", "USA");
		Osoite osoite8 = new OsoiteImpl(8, "Matti ja Riitta Palotie",
				"Jokihaantie 8 B 28", "01600", "Roykka", "Uusimaa", "FINLAND");
		
		osoitteet.add(osoite1);
		osoitteet.add(osoite2);
		osoitteet.add(osoite3);
		osoitteet.add(osoite4);
		osoitteet.add(osoite5);
		osoitteet.add(osoite6);
		osoitteet.add(osoite7);
		osoitteet.add(osoite8);
		
		return osoitteet;
	}

}
