package com.m2i.fomation.servlet.example;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.m2i.formation.jee.assurance.User;
import com.m2i.formation.jee.assurance.UserManager;

/**
 * Servlet implementation class UserUpdateServlet
 */
@WebServlet("/user/update")
public class UserUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		User u = new User();
		u.setId(Integer.parseInt(request.getParameter("id")));
		u.setFirstname(request.getParameter("firstname"));
		u.setLastname(request.getParameter("lastname"));
		u.setAdresse(request.getParameter("adresse"));
		
		
		UserManager.getInstance().update(u);
		//Affichage de la liste des usersactualisée
		displayView(request,response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
private void displayView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
	
	response.setContentType("text/html");
	response.setCharacterEncoding("UTF-8");
	
	response.getWriter().println("Liste actualisée:");
	PrintWriter out = response.getWriter();
	
	out.println("</br>");
	out.println("<a href ='list'>");
	out.println("Liste des users ");
	out.println("</a>");
	

	

	
	
	}
}
