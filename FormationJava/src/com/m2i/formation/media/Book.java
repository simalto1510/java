package com.m2i.formation.media;
import java.util.Date;

public class Book extends Media {
	
	private Date date;
	private int nbPage;
	private int nbAuthors=0;
	private int isbn;
	private String lang;
	private Author[] authors = new Author[10];
	private BookCategory category;
	
	//Methods of class BOOK to delete here !!!!!
	public void afficher(){
		super.afficher();
		System.out.println(" It gets : " + nbPage+" pages ");
		System.out.println(" Its ISBN : " + isbn);
		System.out.println(" Category : " + category);
		System.out.println(" It is written in : " + lang +" by ");
		for (int i = 0; i<nbAuthors; i++){
			authors[i].afficher();
		}
		System.out.println(" ");
		
	}
	public void addAuthor(Author newauthor){
		
			authors[nbAuthors]=newauthor;
			nbAuthors++;	
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
	public int getNbAuthors() {
		return nbAuthors;
	}
	public void setNbAuthors(int nbAuthors) {
		this.nbAuthors = nbAuthors;
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
	public Author[] getAuthors() {
		return authors;
	}
	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}
	public BookCategory getCategory() {
		return category;
	}
	public void setCategory(BookCategory category) {
		this.category = category;
	}
	
	@Override
	public double getVATPrice(){
		return getPrice() * 1.05;
	}
}
