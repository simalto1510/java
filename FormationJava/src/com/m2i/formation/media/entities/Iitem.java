package com.m2i.formation.media.entities;

public interface Iitem extends IEntity {

	void afficher();

	String getTitle();

	void setTitle(String title);

	double getPrice();

	void setPrice(double price);

}