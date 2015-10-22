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
 * Servlet implementation class UserDetailServlet
 */
@WebServlet("/user/detail")
public class UserDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserManager uMan = UserManager.getInstance();
		int idtest = Integer.parseInt(request.getParameter("id"));
		
		User u = uMan.getById(idtest);
		
		//Affichage de la liste des users
		displayView(request,response,u);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	private void displayView(HttpServletRequest request, HttpServletResponse response, User u) throws ServletException, IOException {	
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		response.getWriter().println("Detail de l'utilisateur user N°" + u.getId());
		PrintWriter out = response.getWriter();
		out.println("</br> ");
		out.println("</br> ");

		out.println("<form action='update' method='POST'>");
			out.println("User N° <input type='text' name='id' value='" + u.getId() + "'/>");
			out.println("</br> ");
			out.println(" Frist name: <input type='text' name='firstname' value='" + u.getFirstname() + "'/>");
			out.println("</br> ");
			out.println(" Last name <input type='text' name='lastname' value='" + u.getLastname() + "'/>");
			out.println("</br> ");
			out.println(" Adress : <input type='text' name='adress' value='" + u.getAdresse() + "'/>");
			out.println("</br> ");
			out.println("</br> ");
			out.println("<button> ");
				out.println("Update ");
			out.println("</button> ");
			out.println("</br> ");
		out.println("</form> ");
		
		out.println("</br>");
		out.println("<a href ='list'>");
		out.println("Liste des users ");
		out.println("</a>");
		
		
	}

}
