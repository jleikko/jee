package fi.softala.jee.demo.d13.batch;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fi.softala.jee.demo.d13.bean.Henkilo;
import fi.softala.jee.demo.d13.bean.HenkiloImpl;
import fi.softala.jee.demo.d13.dao.HenkiloDAO;

public class HenkilolistaHandler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		HenkiloDAO dao = (HenkiloDAO)context.getBean("daoLuokka");
		
		System.out.println("-------------------");
		System.out.println("LISTATAAN KAIKKI");
		System.out.println("-------------------");
		
		List<Henkilo> henkilot = dao.haeKaikki();
		for (Henkilo h : henkilot) {
			System.out.println(h.getEtunimi());
		}
		
		System.out.println("-------------------");
		System.out.println("HAETAAN YKSI (ID=3)");
		System.out.println("-------------------");
		
		Henkilo outi = dao.etsi(3);
		System.out.println(outi.getId());
		System.out.println(outi.getEtunimi());
		System.out.println(outi.getSukunimi());
		
		System.out.println("-------------------");
		System.out.println("LISÄTÄÄN UUSI");
		System.out.println("-------------------");
		
		Henkilo henk = new HenkiloImpl();
		henk.setEtunimi("Uusi");
		henk.setSukunimi("Heppu");
		dao.talleta(henk);
		
		System.out.println("-------------------");
		System.out.println("HAETAAN KAIKKI");
		System.out.println("-------------------");
		henkilot = dao.haeKaikki();
		for (Henkilo h : henkilot) {
			System.out.println(h.getEtunimi());
		}

	}

}
