package com.m2i.formation.media;

public class Dvd extends Media {
	private int region;
	
	
	public void afficher(){
		super.afficher();
		System.out.println(" nombre des regions  : " + region);
		}

	public int getRegion() {
		return region;
	}
	public void setRegion(int region) {
		this.region = region;
	}
	
	@Override
	public double getVATPrice(){
		return getPrice() * 1.10;
	}
}
