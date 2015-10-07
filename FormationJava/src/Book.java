import java.util.Date;

public class Book {
	public String title;
	public int id;
	public double price;
	public Date date;
	public int nbPage;
	public int isbn;
	public String lang;
	
	//Methods of class BOOK to delete here !!!!!
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
	
	
	
}
