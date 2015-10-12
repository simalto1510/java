package com.m2i.formation.media;
import java.util.Date;

public class Book extends Media {
	
	private Date date;
	private int nbPage;
	private int isbn;
	private String lang;
	
	
	private BookCategory category;
	
	//Methods of class BOOK to delete here !!!!!
	public void afficher(){
		super.afficher();
		System.out.println(" It gets : " + nbPage+" pages ");
		System.out.println(" Its ISBN : " + isbn);
		System.out.println(" Category : " + category);
		System.out.println(" It is written in : " + lang +" by ");
		Author[] newAuthors = new Author[10]; 
		newAuthors=getAuthors();
		
		for (int i = 0; i< getNbAuthors(); i++){
			newAuthors[i].afficher();
		}
		System.out.println(" ");
		
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getNbPage() {
		return nbPage;
	}
	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public BookCategory getCategory() {
		return category;
	}
	public void setCategory(BookCategory category) {
		this.category = category;
	}
	
	@Override
	public double getVATPrice(){
		return getPrice() * 1.15;
	}
}
