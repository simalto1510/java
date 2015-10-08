import java.util.Date;

public class Book {
	private String title;
	private int id;
	private double price;
	private Date date;
	private int nbPage;
	private int nbAuthors=0;
	private int isbn;
	private String lang;
	private Publisher publisher;
	private Author[] authors = new Author[10];
	
	//Methods of class BOOK to delete here !!!!!
	public void afficher(){
		System.out.println(" The title  : " + title);
		System.out.println(" Its Id is : " + id);
		System.out.println(" It costs : " + price+" $ ");
		System.out.println(" It gets : " + nbPage+" pages ");
		System.out.println(" Its ISBN : " + id);
		System.out.println(" It is written in : " + lang +" by ");
		
		for (int i = 0; i<nbAuthors; i++){
			authors[i].afficher();
		}
		
		System.out.println(" and published by");
		publisher.afficher();
		}
	
	public void addAuthor(Author newauthor){
		
			authors[nbAuthors]=newauthor;
			nbAuthors++;
		
	}
	
 	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	public int getNbPage() {
		return nbPage;
	}
	public void setNbPage(int newnbPage) {
		nbPage = newnbPage;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String newtitle) {
		title = newtitle;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double newprice) {
		price = newprice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date newdate) {
		date = newdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int newid) {
		id = newid;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int newisbn) {
		isbn = newisbn;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String newlang) {
		lang = newlang;
	}


	public int getNbAuthors() {
		return nbAuthors;
	}


	public void setNbAuthors(int nbAuthors) {
		this.nbAuthors = nbAuthors;
	}


	public Author[] getAuthors() {
		return authors;
	}


	public void setAuthor(Author[] authors) {
		this.authors = authors;
	}


	
	
	
}
