package fi.softala.jee.demo.d12;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aloittaja {

	final static Logger logger = LoggerFactory.getLogger(Aloittaja.class);
	  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		logger.debug("Aloitellaan ohjelmaa.");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-conf.xml");
		System.out.println(context.getBean("auto"));
		System.out.println(context.getBean("auto"));
		context.close();
		
		logger.debug("Ohjelman suoritus päättyi.");
	}

}
