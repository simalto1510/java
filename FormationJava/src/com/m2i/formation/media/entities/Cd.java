package com.m2i.formation.media.entities;

public  class Cd extends Media {
	private int nbTrack;
	
	public void afficher(){
		super.afficher();
		System.out.println(" Tracks number  : " + nbTrack);	
			
	}
	
	public int getNbTrack() {
		return nbTrack;
	}
	public void setNbTrack(int nbTrack) {
		this.nbTrack = nbTrack;
	}
	
	@Override
	public double getVATPrice(){
		return getPrice() * 1.2;
	}
}
