
import com.m2i.formation.media.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;

import java.util.Set;
import java.util.Map;
 

public class CollectionTest {
	
	public CollectionTest(){
		
	}
	
//Definition of books

	 
// Methods of this class
	
	public List<Book> listTest(){
	    List<Book> listNew = new ArrayList<Book>();
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.setId(10);
		b1.setIsbn(1877309916);
		b1.setLang("chinese");
		b1.setTitle("Grenouilles");
		b1.setPrice(19.20);
		b1.setNbPage(200);
		b1.setCategory(BookCategory.Computer);
		
		b2.setId(11);
		b2.setIsbn(14451253);
		b2.setLang("Japanese");
		b2.setTitle("Yokohama");
		b2.setPrice(10.20);
		b2.setCategory(BookCategory.SF);
		b2.setNbPage(500);
		
		b3.setId(12);
		b3.setIsbn(1333333);
		b3.setLang("french");
		b3.setTitle("Louis XV");
		b3.setPrice(18.20);
		b3.setCategory(BookCategory.Database);
		b3.setNbPage(300);
		
		Book b4 = new Book();
		b4.setId(13);
		b4.setIsbn(1222222);
		b4.setLang("french");
		b4.setTitle("Pierre XV");
		b4.setPrice(17.20);
		b4.setCategory(BookCategory.Database);
		b4.setNbPage(200);
		
		
		Publisher p = new Publisher();
		p.setNom("Points");
		p.setPays("France");
		p.setSiret(1425452);
		p.setEmail("point@gmail.fr");
		  
		Publisher p1 = new Publisher();
		p1.setNom("Flammarian");
		p1.setPays("France");
		p1.setSiret(1000002);
		p1.setEmail("flammarian@gmail.fr");
	
		Author a= new Author();
		a.setFirstname("Mo");
		a.setLastname("Yo");
		  
		Author a1= new Author();
		a1.setFirstname("Louis");
		a1.setLastname("Floop");
		  
		Author a2= new Author();
		a2.setFirstname("Marc");
		a2.setLastname("Lopez");
		  
		  
		b1.setPublisher(p);
		b2.setPublisher(p1);
		b3.setPublisher(p);
		b4.setPublisher(p1);
		
		try {
			b1.addAuthor(a);
			b2.addAuthor(a1);
			b3.addAuthor(a2); 
			b4.addAuthor(a);
		  	} 
		  catch (MediaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//if I get this kind of error I execute this action otherwise I do the action above
		  }
	//Add 3 books in the list	
		listNew.add(b1);
		listNew.add(b2);
		listNew.add(b3);
		
	//Insert 1 book at index 1
		
		listNew.add(1,b4);
		
	//remove 1 book at index 2
		listNew.remove(2);
		
		return listNew;
	}
	
	
	public Set<Book> setTest(){
		Set<Book> setNew = new HashSet<Book>(); 
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		b1.setId(10);
		b1.setIsbn(1877309916);
		b1.setLang("chinese");
		b1.setTitle("Grenouilles");
		b1.setPrice(19.20);
		b1.setNbPage(200);
		b1.setCategory(BookCategory.Computer);
		
		b2.setId(11);
		b2.setIsbn(14451253);
		b2.setLang("Japanese");
		b2.setTitle("Yokohama");
		b2.setPrice(10.20);
		b2.setCategory(BookCategory.SF);
		b2.setNbPage(500);
		
		b3.setId(12);
		b3.setIsbn(1333333);
		b3.setLang("french");
		b3.setTitle("Louis XV");
		b3.setPrice(18.20);
		b3.setCategory(BookCategory.Database);
		b3.setNbPage(300);
		
		
		Publisher p = new Publisher();
		p.setNom("Points");
		p.setPays("France");
		p.setSiret(1425452);
		p.setEmail("point@gmail.fr");
		  
		Publisher p1 = new Publisher();
		p1.setNom("Flammarian");
		p1.setPays("France");
		p1.setSiret(1000002);
		p1.setEmail("flammarian@gmail.fr");
	
		Author a= new Author();
		a.setFirstname("Mo");
		a.setLastname("Yo");
		  
		Author a1= new Author();
		a1.setFirstname("Louis");
		a1.setLastname("Floop");
		  
		Author a2= new Author();
		a2.setFirstname("Marc");
		a2.setLastname("Lopez");
		  
		  
		b1.setPublisher(p);
		b2.setPublisher(p1);
		b3.setPublisher(p);
	
		
		//add 3 books
	
		setNew.add(b3);
		setNew.add(b3); 
		
		//Insert 1 same book twice
		
		
		return setNew;
		
		
	}
	
	public Map<Integer, Book> mapTest(){
		
		Map <Integer, Book> m = new HashMap<Integer, Book>(); 
		Book b1 = new Book();
		
		b1.setId(10);
		b1.setIsbn(1877309916);
		b1.setLang("chinese");
		b1.setTitle("Grenouilles");
		b1.setPrice(19.20);
		b1.setNbPage(200);
		b1.setCategory(BookCategory.Computer);
		
		
		Publisher p = new Publisher();
		p.setNom("Points");
		p.setPays("France");
		p.setSiret(1425452);
		p.setEmail("point@gmail.fr");
		  
	
		Author a= new Author();
		a.setFirstname("Mo");
		a.setLastname("Yo");
	
		  
		b1.setPublisher(p);
	
		m.put(b1.getId(), b1);
		
		
		return m;
	}
  

}
