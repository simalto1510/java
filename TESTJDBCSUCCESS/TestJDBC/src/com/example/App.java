package com.example;
import java.sql.*;


public class App {

	@SuppressWarnings("unused")
	private static final String JDBC_DIVER = "com.mysql.jdbc.Driver"; //Nopm du driver JDC utilisée
	private static final String JDBC_URL = "jdbc:mysql://localhost/jee"; //Objcet de connection
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";
	
	
	public static void main(String[] args) {
		
		Connection conn = null;
		//Statement stmt = null;
		//Statement stmt1 = null;
		
		
		PreparedStatement stmtP = null;
		
		
		
		//Exception
		try{
			//Step 1 : Connection
			System.out.println("connecting ...");
			conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
			
			//Step 2 : statement
		/*	System.out.println("create statement");
			stmt = conn.createStatement();
			stmt1 = conn.createStatement();
			
			
			
			
			//Step 3 : statement
			System.out.println("Send SQL ...");
			ResultSet rs = stmt.executeQuery("select * from user;"); //SQL Request always ends by ";"
			
			while(rs.next()){
				
				System.out.println("User: " +rs.getInt("id")); //Je donne le nom de la colonne à getInt 
				System.out.println(" - " +rs.getString("firstname") + " " + rs.getString("lastname")); //
				System.out.println(" - " +rs.getString("adresse")); 
			}
			rs.close();
			
			int resSql = stmt1.executeUpdate("insert into user values(31, 'BON','Singet','31 RUE DE LA FOR CASE');");
			rs = stmt1.executeQuery("select * from user;");
			

			System.out.println(" records: " +resSql);
			System.out.println("New result :");
			System.out.println(" ");
		
			//Step 4 : Loop on rs
			//While because rs isn't a list
			if (resSql == 1){
				while(rs.next()){
					
					System.out.println("User: " +rs.getInt("id")); //Je donne le nom de la colonne à getInt 
					System.out.println(" - " +rs.getString("firstname") + " " + rs.getString("lastname")); //
					System.out.println(" - " +rs.getString("adresse")); 
				}
			}
			else
			{
				System.out.println(" Insert failed "); 
			}
			
			//Step 5 : close rs
			rs.close();*/
			
	///Prepare statement use
			stmtP = conn.prepareStatement("insert into user values (?,?,?,?);");
			//Send SQL
			System.out.println(" Send SQL ... "); 
			stmtP.setInt(1, 55);
			stmtP.setString(2, "BUBU");
			stmtP.setString(3, "BOU");
			stmtP.setString(4, "9 RUE DE VIDEL");
			stmtP.executeUpdate();
			
			System.out.println(" Send SQL ... "); 
			stmtP.setInt(1,85);
			stmtP.setString(2, "SON");
			stmtP.setString(3, "GOKU");
			stmtP.setString(4, "10 RUE DE BULMA");
			stmtP.executeUpdate();
			
			
			
			
			
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{ //Close the connection 
				System.out.println("Exciting ...");
				//Exception for stmt
				/*try{
					if(stmt != null){
						stmt.close();
					}
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
				try{
					if(stmt1 != null){
						stmt1.close();
					}
				}
				catch(Exception e){
					e.printStackTrace();
				}*/
				
				try{
					if(stmtP != null){
						stmtP.close();
					}
				}
				catch(Exception e){
					e.printStackTrace();
				}
				
				//Exception for conn
				try{
					if(conn != null){
						conn.close();
					}
				}
				catch(Exception e){
					e.printStackTrace();
				}
		} 

	}

}
