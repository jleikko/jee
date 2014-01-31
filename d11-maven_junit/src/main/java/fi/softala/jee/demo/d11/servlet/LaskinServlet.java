package fi.softala.jee.demo.d11.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fi.softala.jee.demo.d11.laskin.Laskin;

/**
 * Servlet implementation class LaskinServlet
 */
@WebServlet("/laskin")
public class LaskinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LaskinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//EKA LUKU
		int eka = 0;
		try {
			eka = Integer.parseInt(request.getParameter("luku1"));
		} catch(NumberFormatException e) {
			System.out.println("luku 1 ei ole kunnollinen kokonaisluku");
		}
		//TOKA LUKU
		int toka = 0;
		try {
			toka = Integer.parseInt(request.getParameter("luku2"));
		} catch(NumberFormatException e) {
			System.out.println("luku 2 ei ole kunnollinen kokonaisluku");
		}
		
		//LASKETAAN SUMMA LASKIMELLA
		Laskin laskin = new Laskin();
		int tulos = 0;
		String operaatio = request.getParameter("operaatio");
		if (operaatio != null && operaatio.equals("summa")) {
			tulos = laskin.summaa(eka, toka);
		} else if (operaatio != null && operaatio.equals("kerto")) {
			tulos = laskin.kertolasku(eka, toka);
		} else {
			tulos = 0;
		}
		
		//FORWARDOIDAAN JSP:LLE (MUOTOILU)
		request.setAttribute("tulos", tulos);
		request.getRequestDispatcher("WEB-INF/jsp/laskin.jsp").forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
