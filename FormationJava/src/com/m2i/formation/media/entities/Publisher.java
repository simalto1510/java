package com.m2i.formation.media.entities;

public class Publisher {
	private String nom;
	private int siret;
	private String email;
	private String pays;
	
//Methods of class BOOK to delete here !!!!!
	public void afficher(){
		System.out.println(" Publisher's name : " + nom);
		System.out.println(" Its Siret : " + siret);
		System.out.println(" Contact mail : " + email);
		System.out.println(" It is located in : " +pays);
		}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSiret() {
		return siret;
	}
	public void setSiret(int siret) {
		this.siret = siret;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
}
