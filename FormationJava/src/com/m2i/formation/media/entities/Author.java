package com.m2i.formation.media.entities;

public class Author implements IEntity {
	private String firstname;
	private String lastname;
	private int id;
	
	public void afficher(){
		System.out.println(" First name : " + firstname);
		System.out.println(" Last name : " + lastname);
		}
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
