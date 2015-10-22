package com.m2i.fomation.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServletP1
 */
@WebServlet("/MyServletP1")
public class MyServletP1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServletP1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//TP1
		//On va maintennat recevoir les pages HTML 
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("<Page 1>");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>");
		out.println("HELLO WORLD Page P1");
		out.println("</h1>");
		
	
		//TP2
		//Taper un nom su P1 et l'afficher sur P2
		out.println("<h2>");
		out.println("your name");
		out.println("</h2>");
		out.println("<form action='MyServletP2' method='POST'>");
		out.println("<input type='text' name='name'>");
		out.println("<h2>");
		out.println("Lastname");
		out.println("</h2>");
		out.println("<input type='text' name='lastname'>");
		out.println("<button>");
		out.println("GOOOO");
		out.println("</button>");
		out.println("</form>");
	
		out.println("</br>");
		out.println("<a href ='http://localhost:8080/FormationJEE/MyServletP2'>");
		out.println("Page 2");
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
