package com.m2i.formation.jee.assurance;
import java.sql.*;
import java.util.*;



public class UserManager {

	private Map <Integer, User> cache = new HashMap<Integer, User>(); //Map plus
	
	private static final UserManager instance = new UserManager();
	
	//Singleton
	public static final UserManager getInstance(){
		return UserManager.instance;
	}
	//constructor
	private UserManager(){
		if (instance == null)
		{
			getInstance();
		}
		
		/*User u1 = new User();
		User u2 = new User();
		User u3 = new User();
		
		u1.setId(10);
		u1.setFirstname("Jus de");
		u1.setLastname("Pomme");
		u1.setAdresse("10 place rouge");
		this.add(u1);
		
		u2.setId(11);
		u2.setFirstname("Jus de");
		u2.setLastname("Poire");
		u2.setAdresse("11 place Verte");
		this.add(u2);
		
		u3.setId(12);
		u3.setFirstname("Jus de");
		u3.setLastname("Raisin");
		u3.setAdresse("12 place Voilet");
		this.add(u3);
		*/
	}

	//Other Methods
	public void add(User u){
		this.cache.put(u.getId(), u);
	}
	
	public void remove(User u){
		this.cache.remove(u.getId(), u);
	}
	
	@SuppressWarnings("static-access")
	public void update(User u){
		
		ConnectionJDBC connJdbc = new ConnectionJDBC();
		PreparedStatement stmtP = null;
		
		String SQLrequest ="UPDATE user SET";
		SQLrequest += "id=?,";
		SQLrequest += "firstname=?,";
		SQLrequest += "lastname=?,";
		SQLrequest += "adresse=?,";
		SQLrequest += "WHERE id=?;";
	
		
		try{
			stmtP = connJdbc.getInstance().prepareStatement(SQLrequest);
			stmtP.setInt(1,u.getId()) ;
			stmtP.setString(2, u.getFirstname());
			stmtP.setString(3,u.getLastname());
			stmtP.setString(4, u.getAdresse());
			int rest = stmtP.executeUpdate();
			
			if(rest == 1){
				System.out.println("List updated");
			}
			else{
				System.out.println("List update failed");
			}

		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		finally{ //Close the connection 
			System.out.println("Exciting ...");
			//Exception for stmt
			try{
				if(stmtP != null){
					stmtP.close();
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}

	/*Old GetById
	 * public User getById(int id){
		return this.cache.get(id);
	}
	*/
	@SuppressWarnings("static-access")
	public User getById(int id){
		ConnectionJDBC connJdbc = new ConnectionJDBC();
		PreparedStatement stmtP = null;
		String SQLrequest ="select * from user where id=?;";
		User u = null;
		
		try{
			stmtP = connJdbc.getInstance().prepareStatement(SQLrequest);
			stmtP.setInt(1,id) ;
			ResultSet rs =stmtP.executeQuery();
			
			if(rs.next()){
				
				u = new User();
				u.setId(rs.getInt("id"));
				u.setFirstname((rs.getString("firstname")));
				u.setLastname((rs.getString("lastname")));
				u.setAdresse((rs.getString("adresse")));
			}	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		finally{ //Close the connection 
			System.out.println("Exciting ...");
			//Exception for stmt
			try{
				if(stmtP != null){
					stmtP.close();
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		
		
		return u;
	}
	
	/*Old getALL()
	public List<User> getAll(){
		final List<User> users = new ArrayList<User>(this.cache.values());
		return users;
	}*/
	

	@SuppressWarnings("static-access")
	public List<User> getAll() {
		final List<User> users = new ArrayList<User>(this.cache.values());
		ConnectionJDBC connJdbc = new ConnectionJDBC();
		Statement stmtNew = null;
		String SQLrequest ="select * from user;";
		
		try{
			
			System.out.println("create statement");
			stmtNew =connJdbc.getStatement();
			//Step 3 : statement
			ResultSet rs =stmtNew.executeQuery(SQLrequest); //SQL Request always ends by ";"
		
			//Step 4 : Loop on rs
			//While because rs isn't a list
			while(rs.next()){
				
				User u = new User();
				u.setId(rs.getInt("id"));
				u.setFirstname(rs.getString("firstname"));
				u.setLastname(rs.getString("lastname"));
				u.setAdresse(rs.getString("adresse"));
				users.add(u);
			}
			rs.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{ //Close the connection 
			System.out.println("Exciting ...");
			//Exception for stmt
			try{
				if(stmtNew != null){
					stmtNew.close();
				}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		return users;
		
	}
	
	
	
	//Getters and setter
	public Map<Integer, User> getUsers() {
		return cache;
	}

	public void setUsers(Map<Integer, User> cache) {
		this.cache = cache;
	}
}
