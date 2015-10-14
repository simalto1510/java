package com.m2i.formation.media.entities;

public abstract class Media extends Item{
	
	private Publisher publisher;
	private int nbAuthors=0;
	private Author[] authors = new Author[10];
//Methods for Media class;	
	
	public void afficher(){
		super.afficher();
		System.out.println(" and published by");
		publisher.afficher();
		
	}
	
	public Author[] getAuthors() {
		return authors;
	}

	public void setAuthors(Author[] authors) {
		this.authors = authors;
	}

	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	public void addAuthor(Author newauthor) throws MediaException{
		if(nbAuthors >10){
			throw new MediaException("Too many authors");//If i have this error, I throw it above the "top class"here main.
		}
			authors[nbAuthors]=newauthor;
			nbAuthors++;	
	}
	public int getNbAuthors() {
		return nbAuthors;
	}
	public void setNbAuthors(int nbAuthors) {
		this.nbAuthors = nbAuthors;
	}
	
	public abstract double getVATPrice();

}
