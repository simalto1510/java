package com.m2i.formation.media;

public abstract class Media extends Item{
	
	private Publisher publisher;
//Methods for Media class;	
	
	public void afficher(){
		super.afficher();
		System.out.println(" and published by");
		publisher.afficher();
	}
	
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	public abstract double getVATPrice();

}
