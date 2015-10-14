package com.m2i.formation.media.entities;

public interface Iitem {

	void afficher();

	int getId();

	void setId(int id);

	String getTitle();

	void setTitle(String title);

	double getPrice();

	void setPrice(double price);

}