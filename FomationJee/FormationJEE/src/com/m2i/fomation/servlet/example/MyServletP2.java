package com.m2i.fomation.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletP2
 */
@WebServlet("/MyServletP2")
public class MyServletP2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServletP2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		
		//On va maintennat recevoir les pages HTML
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter(); //Out pour eviter d'écrire" response.getWriter() tout le long"
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("<Page 2>");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("HELLO WORLD Page P2");
		out.println("</h1>");
		
		out.println("<h2>");
		out.println("your name is ");
		out.println("</h2>");
		out.println("<p>");
		out.println("Bonjour " + request.getParameter("name") + " " + request.getParameter("lastname") );
		out.println("</p>");
		out.println("</h1>");
		
		
		out.println("</br>");
		out.println("<a href ='http://localhost:8080/FormationJEE/MyServletP1'>");
		out.println("Page 1");
		out.println("</a>");
		
		
		out.println("</body>");
		out.println("</html>");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
