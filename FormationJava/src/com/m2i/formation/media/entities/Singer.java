package com.m2i.formation.media.entities;

public class Singer {
	private String firstname;
	private String lastname;
	private int age;
	
	public void afficher(){
		System.out.println(" First name : " + firstname);
		System.out.println(" Last name : " + lastname);
		System.out.println(" age : " + age);
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
