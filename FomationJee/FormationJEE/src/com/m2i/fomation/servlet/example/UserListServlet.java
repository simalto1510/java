package com.m2i.fomation.servlet.example;

import java.util.*;

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
 * Servlet implementation class UserListServlet
 */
@WebServlet("/user/list")
public class UserListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		UserManager uMan = UserManager.getInstance();
		List<User> listUsers = uMan.getAll();
		
		//Affichage de la liste des users
		displayView(request,response,listUsers);
		
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
private void displayView(HttpServletRequest request, HttpServletResponse response, List<User> luser) throws ServletException, IOException {	
	
	response.setContentType("text/html");
	response.setCharacterEncoding("UTF-8");
	
	response.getWriter().println("Affichage de la liste des utilisateurs :");
	PrintWriter out = response.getWriter();
	out.println("</br> ");
	out.println("</br> ");
	
	for (User uNouv:luser){
		 out.println(" User n°" + uNouv.getId());
		 out.println("</br> ");
		 out.println(" User'first name : " + uNouv.getFirstname());
		 out.println("</br> ");
		 out.println(" User'last name :" + uNouv.getLastname());
		 out.println("</br> ");
		 out.println(" User'adress :" + uNouv.getAdresse());
		 out.println("</br> ");
		 out.println("<a href ='detail?id="  + uNouv.getId() + "'> Detail user " +uNouv.getId() +"</a>");
		 out.println("</br> ");
		 out.println("</br> ");
		 
	 }
	
	}

}
