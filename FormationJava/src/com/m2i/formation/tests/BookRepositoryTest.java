package com.m2i.formation.tests;

import java.io.IOException;
import java.util.*;

import org.junit.*;

import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.MediaException;
import com.m2i.formation.media.repositories.BookRepository;


public class BookRepositoryTest {

	
	@Test
	public void setUritTest() throws IOException, MediaException {
		
		BookRepository br = new BookRepository();
		String newUri = "C:\\Users\\adminlocal\\Desktop\\Booklist.csv";
		String falseUri = "C:\\Users\\adminlocal\\Desktop\\BookListNew.csv";
		
		br.setUri(newUri);
		Assert.assertEquals(falseUri,br.getUri());
	}
	
	
	@Test
	public void getAllTest() throws IOException, MediaException {
		
		BookRepository br = new BookRepository();
		List<Book> lB= new ArrayList<Book>();
		String newUri = "C:\\Users\\adminlocal\\Desktop\\Booklist.csv";
		br.setUri(newUri);
		
		lB = br.getAll();
		Assert.assertEquals(9,lB.size());
	}
	
	@Test
       public void getByIdTest() throws IOException, MediaException {
		
		BookRepository br = new BookRepository();
		int idTest = 1;
		int idBookchosen = 1;
		String newUri = "C:\\Users\\adminlocal\\Desktop\\Booklist.csv";
		Book b = new Book();
		
		br.setUri(newUri);
		b = br.getById(idBookchosen);
		
		Assert.assertEquals(idTest,b.getId());
		}
	
	@Test
    public void getByPriceTest() throws IOException, MediaException {
		
		BookRepository br = new BookRepository();
		int nbBookexpectedTest = 4;
		double priceBookchosen = 18.0;
		String newUri = "C:\\Users\\adminlocal\\Desktop\\Booklist.csv";
		List<Book> lB= new ArrayList<Book>();
		
		br.setUri(newUri);
		lB = br.getByPrice(priceBookchosen);
		
		Assert.assertEquals(nbBookexpectedTest,lB.size());
		}
	
	@Test
    public void getBytitleTest() throws IOException, MediaException {
		
		BookRepository br = new BookRepository();
		int nbBookexpectedTest = 1;
		String titleBookchosen = "Conte";
		String newUri = "C:\\Users\\adminlocal\\Desktop\\Booklist.csv";
		List<Book> lB= new ArrayList<Book>();
		
		br.setUri(newUri);
		lB = br.getByTitle(titleBookchosen);
		
		Assert.assertEquals(nbBookexpectedTest,lB.size());
	}
	
	@Test
	public void insertBookTest() throws IOException, MediaException {
		Book b = new Book();
		b.setTitle("Java");
		b.setPrice(9.99);
		BookRepository br = new BookRepository();
		
		
		int nbbook = br.getAll().size();
		br.insert(b);
		Assert.assertEquals(nbbook+1, br.getAll().size());	
	}
	
	
	
}
