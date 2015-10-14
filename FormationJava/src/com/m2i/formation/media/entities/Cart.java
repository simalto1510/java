package com.m2i.formation.media.entities;
import java.util.*;


public class Cart {
	private List<Media> medias = new ArrayList<Media>();//Create the class cart with n medias

	
	//Methods of class Cart
	public List<Media> getMedias() {
		return medias;
	}
	/**
	 * Retourne le prix TTC du panier par polymorphisme
	 * @return
	 */
	public  double getVATPrice(){
		double VATPrice = 0;
		for (Media mNew:medias){
			VATPrice = VATPrice + mNew.getVATPrice(); //Sum all VATPrice of different types of media
		}
		return VATPrice;
	}
}
