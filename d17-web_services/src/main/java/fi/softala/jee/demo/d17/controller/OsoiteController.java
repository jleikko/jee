package fi.softala.jee.demo.d17.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.softala.jee.demo.d17.bean.Osoite;
import fi.softala.jee.demo.d17.dao.OsoiteDAO;
import fi.softala.jee.demo.d17.dao.OsoiteDAOFileImpl;
import fi.softala.jee.demo.d17.dao.OsoiteWrapper;

@Controller
@RequestMapping(value = "/osoitteet")
public class OsoiteController {

	// FORMIN TEKEMINEN
	@RequestMapping(value = "kaikki", method = RequestMethod.GET)
	public String getCreateForm(Model model) {
		List<Osoite> osoitteet = new ArrayList<Osoite>();
		OsoiteDAO dao = new OsoiteDAOFileImpl();
		osoitteet = dao.haeKaikki();
		model.addAttribute("osoitteet", osoitteet);
		return "secure/osoitteet";
	}

	// PALAUTA OSOITTEET JSONINA AS "application/json" RESPOSE TYPE
	@RequestMapping(value = "/haeosoitteet", produces = "application/json;charset=UTF-8")
	public @ResponseBody
	OsoiteWrapper getTransactionsAsJSON() {
		OsoiteWrapper jsonWrapper = new OsoiteWrapper();
		OsoiteDAO dao = new OsoiteDAOFileImpl();
		jsonWrapper.setOsoitteet(dao.haeKaikki());
		return jsonWrapper;
	}

}
