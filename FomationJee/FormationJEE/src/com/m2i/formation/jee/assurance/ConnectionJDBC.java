package com.m2i.formation.jee.assurance;
import java.sql.*;


public class ConnectionJDBC {
	
	@SuppressWarnings("unused")
	private static final ConnectionJDBC instance = new ConnectionJDBC();
	
	private static final String JDBC_DIVER = "com.mysql.jdbc.Driver"; //Nopm du driver JDC utilisée
	private static final String JDBC_URL = "jdbc:mysql://localhost/jee"; //Objcet de connection
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";
	
	private static Connection conn = null;
	private static Statement stmt = null;

	
	
	//Singleton
	public static final Connection getInstance(){
		
		if(conn == null){
			
			System.out.println("connecting ...");
			try {
				conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return conn;
		
		
	}
	
	
	public static Statement getStatement(){
		
		try{
			//Step 1 : Connection
			System.out.println("connecting ...");
			
			//Force le serveur à utiliser ce driver
			Class.forName(JDBC_DIVER);
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			//Step 2 : statement
			System.out.println("create statement");
			stmt = conn.createStatement();
		}
		catch(SQLException e){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}
	
	//Getters and Setters

	

	public static Connection getConn() {
		return conn;
	}


	public static void setConn(Connection conn) {
		ConnectionJDBC.conn = conn;
	}


	public static Statement getStmt() {
		return stmt;
	}


	public static void setStmt(Statement stmt) {
		ConnectionJDBC.stmt = stmt;
	}
	
	
	

}
