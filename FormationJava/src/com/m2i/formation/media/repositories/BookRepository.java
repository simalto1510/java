package com.m2i.formation.media.repositories;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import com.m2i.formation.media.entities.Author;
import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.BookCategory;
import com.m2i.formation.media.entities.MediaException;
import com.m2i.formation.media.entities.Publisher;

public class BookRepository implements IRepository<Book> {
	
	private String uri;
 //	private List<Book> cache;

	@Override
	public String getUri() {
		// TODO Auto-generated method stub
		return uri;
	}

	@Override
	public void setUri(String uri) {
		// TODO Auto-generated method stub
		this.uri=uri;
	}
	/****    Improved Version
	
		private List<Book> getCache() throws IOException {
		if(cache == null) {
			cache = cacheFactory();
		}
		return cache;
	}

	private List<Book> cacheFactory() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(uri));
		br.readLine();
		String line = br.readLine();
		int id=0;
		List<Book> l = new ArrayList<Book>();
		while(line != null) {
			StringTokenizer st = new StringTokenizer(line,";");
			String author = st.nextToken();
			String title = st.nextToken();
			String publisher = st.nextToken();
			double price = Double.parseDouble(st.nextToken());
			id++;
			Book b = new Book();
			b.setId(id);
			b.setTitle(title);
			b.setPrice(price);
			l.add(b);
			line = br.readLine();
		}
		br.close();
		return l;
	}
	@Override 
	public List<Book> getAll() throws IOException {
		return getCache();
	}

	@Override
	public Book getById(int id) throws IOException {
		Book b = null;
		for(Book b2 : getCache()) {
			if(b.getId() == id) {
				b = b2;
			}
		}
		return b;
	}

	@Override
	public List<Book> getByPrice(double price) throws IOException {
		List<Book> l = new ArrayList<Book>();
		for(Book b : getCache()) {
			if(b.getPrice() <= price) {
				l.add(b);
			}
		}
		return l;
	}

	@Override
	public List<Book> getByTitle(String word) throws IOException {
		List<Book> l = new ArrayList<Book>();
		for(Book b : getCache()) {
			if(b.getTitle().toUpperCase().contains(word.toUpperCase())) {
				l.add(b);
			}
		}
		return l;
	}

	**/

	@Override
	public List<Book> getAll() throws IOException, MediaException 
	{
		 List<Book> listBook = new ArrayList<Book>();
		 BufferedReader br = new BufferedReader(new FileReader(uri));
		 String line;
		
		line=br.readLine();
		line=br.readLine(); // To not read the title of column 
	
		while(line!=null) {
			// treatment
			//read the line of the file 
			Book b = new Book();
			Author a= new Author();
			Publisher p= new Publisher();
			int category =0;
	
			StringTokenizer st = new StringTokenizer(line,";");
			b.setTitle(st.nextToken());
			b.setId(Integer.parseInt(st.nextToken()));
			b.setNbPage(Integer.parseInt(st.nextToken()));
			b.setPrice(Double.parseDouble(st.nextToken()));
			a.setFirstname(st.nextToken());
			p.setNom(st.nextToken());
			b.setIsbn(Integer.parseInt(st.nextToken()));
			b.setLang(st.nextToken());
			category = Integer.parseInt(st.nextToken());
			a.setLastname(st.nextToken());
			p.setEmail(st.nextToken());
			p.setPays(st.nextToken());
			p.setSiret(Integer.parseInt(st.nextToken()));
			
			switch (category)
			{
				case 0 :
					b.setCategory(BookCategory.SF);
					break;
				case 1 :
					b.setCategory(BookCategory.Computer);
					break;
				case 2 :
					b.setCategory(BookCategory.Database);
					break;
				case 3 :
					b.setCategory(BookCategory.Novel);
					break;
				case 4 :
					b.setCategory(BookCategory.Tale);
					break;
				case 5 :
					b.setCategory(BookCategory.History);
					break;
				default:
					System.out.println("Case doesn't exist");
					
			}
			b.setPublisher(p);
			b.addAuthor(a);
			line=br.readLine();
			listBook.add(b);
		}
		br.close();
		return listBook;
		
		
	}

	@Override
	public Book getById(int id) throws IOException, MediaException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line;
		Book b = new Book();
		Author a= new Author();
		Publisher p= new Publisher();
		int idtest =0;
		int category=0;
		
		line=br.readLine();
		line=br.readLine(); // To not read the title of column 
	
		while(line!=null) {
			StringTokenizer st = new StringTokenizer(line,";");
			b.setTitle(st.nextToken());
			b.setId(Integer.parseInt(st.nextToken()));
			b.setNbPage(Integer.parseInt(st.nextToken()));
			b.setPrice(Double.parseDouble(st.nextToken()));
			a.setFirstname(st.nextToken());
			p.setNom(st.nextToken());
			b.setIsbn(Integer.parseInt(st.nextToken()));
			b.setLang(st.nextToken());
			category = Integer.parseInt(st.nextToken());
			a.setLastname(st.nextToken());
			p.setEmail(st.nextToken());
			p.setPays(st.nextToken());
			p.setSiret(Integer.parseInt(st.nextToken()));
			
			switch (category)
			{
				case 0 :
					b.setCategory(BookCategory.SF);
					break;
				case 1 :
					b.setCategory(BookCategory.Computer);
					break;
				case 2 :
					b.setCategory(BookCategory.Database);
					break;
				case 3 :
					b.setCategory(BookCategory.Novel);
					break;
				case 4 :
					b.setCategory(BookCategory.Tale);
					break;
				case 5 :
					b.setCategory(BookCategory.History);
					break;
				default:
					System.out.println("Case doesn't exist");
					
			}
			b.setPublisher(p);
			b.addAuthor(a);
			line=br.readLine();
			idtest=b.getId();
			
			//test to look for book
			if (idtest == id){
				b.setId(idtest);
				br.close();
				return b;
			}
			line=br.readLine();
				
		}
		br.close();
		return b;
	}
	
	@Override
	public List<Book> getByPrice(double price) throws IOException, MediaException {
		List<Book> listBook = new ArrayList<Book>();
		 BufferedReader br = new BufferedReader(new FileReader(uri));
		 String line;
		 double priceTest =0;
		
		line=br.readLine();
		line=br.readLine(); // To not read the title of column 
	
		while(line!=null) {
			// treatment
			//read the line of the file 
			Book b = new Book();
			Author a= new Author();
			Publisher p= new Publisher();
			int category=0;
	
			StringTokenizer st = new StringTokenizer(line,";");
			b.setTitle(st.nextToken());
			b.setId(Integer.parseInt(st.nextToken()));
			b.setNbPage(Integer.parseInt(st.nextToken()));
			b.setPrice(Double.parseDouble(st.nextToken()));
			a.setFirstname(st.nextToken());
			p.setNom(st.nextToken());
			b.setIsbn(Integer.parseInt(st.nextToken()));
			b.setLang(st.nextToken());
			category = Integer.parseInt(st.nextToken());
			a.setLastname(st.nextToken());
			p.setEmail(st.nextToken());
			p.setPays(st.nextToken());
			p.setSiret(Integer.parseInt(st.nextToken()));
			
			switch (category)
			{
				case 0 :
					b.setCategory(BookCategory.SF);
					break;
				case 1 :
					b.setCategory(BookCategory.Computer);
					break;
				case 2 :
					b.setCategory(BookCategory.Database);
					break;
				case 3 :
					b.setCategory(BookCategory.Novel);
					break;
				case 4 :
					b.setCategory(BookCategory.Tale);
					break;
				case 5 :
					b.setCategory(BookCategory.History);
					break;
				default:
					System.out.println("Case doesn't exist");
					
			}
			b.setPublisher(p);
			b.addAuthor(a);
			line=br.readLine();
			
			priceTest = b.getPrice();
			if (priceTest <= price){
				
				listBook.add(b);
			}
		}
		br.close();
		return listBook;
	}

	@Override
	public List<Book> getByTitle(String word) throws IOException, MediaException {
		 //Variables definition
		 List<Book> listBook = new ArrayList<Book>();
		 BufferedReader br = new BufferedReader(new FileReader(uri));
		 String line;
		 String wordTest1;
		 String wordTest2;
		 int category=0;
		 
		line=br.readLine();
		line=br.readLine(); // To not read the title of column 
	
		while(line!=null) {
			// treatment
			//read the line of the file 
			Book b = new Book();
			Author a= new Author();
			Publisher p= new Publisher();
	
			StringTokenizer st = new StringTokenizer(line,";");
			b.setTitle(st.nextToken());
			b.setId(Integer.parseInt(st.nextToken()));
			b.setNbPage(Integer.parseInt(st.nextToken()));
			b.setPrice(Double.parseDouble(st.nextToken()));
			a.setFirstname(st.nextToken());
			p.setNom(st.nextToken());
			b.setIsbn(Integer.parseInt(st.nextToken()));
			b.setLang(st.nextToken());
			category = Integer.parseInt(st.nextToken());
			a.setLastname(st.nextToken());
			p.setEmail(st.nextToken());
			p.setPays(st.nextToken());
			p.setSiret(Integer.parseInt(st.nextToken()));
			
			switch (category)
			{
				case 0 :
					b.setCategory(BookCategory.SF);
					break;
				case 1 :
					b.setCategory(BookCategory.Computer);
					break;
				case 2 :
					b.setCategory(BookCategory.Database);
					break;
				case 3 :
					b.setCategory(BookCategory.Novel);
					break;
				case 4 :
					b.setCategory(BookCategory.Tale);
					break;
				case 5 :
					b.setCategory(BookCategory.History);
					break;
				default:
					System.out.println("Case doesn't exist");
					
			}
			
			b.setPublisher(p);
			b.addAuthor(a);
			line=br.readLine();
			
		//Mettre ous les caracteres en Majiscule
			
			wordTest1 = b.getTitle();
			wordTest1 = wordTest1.toUpperCase();
			wordTest2 = word.toUpperCase();
			if (wordTest1.contains(wordTest2)){
				
				listBook.add(b);
			}
		}
		br.close();
		return listBook;
	}
	

}
