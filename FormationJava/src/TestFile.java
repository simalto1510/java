import java.util.*;

import com.m2i.formation.media.entities.Author;
import com.m2i.formation.media.entities.Book;
import com.m2i.formation.media.entities.MediaException;
import com.m2i.formation.media.entities.Publisher;

import java.io.*;

public class TestFile 
	{
		public void Readfile(String uri) throws IOException
		{
		
		BufferedReader br = new BufferedReader(new FileReader(uri));
		String line;
		String title;
		String author;
		String publisher;
		double price;
		int nbPages;
		int id;
		
		line=br.readLine();
		line=br.readLine(); // To not read the title of column 
		
		System.out.println(" ***************");
		System.out.println(" File Treatment ");
		System.out.println(" ***************");
		while(line!=null) {
			// treatment
			
			//read the line of the file 
			StringTokenizer st = new StringTokenizer(line,";");
			
			title = st.nextToken();
			id= Integer.parseInt(st.nextToken());
			nbPages= Integer.parseInt(st.nextToken());
			price= Double.parseDouble(st.nextToken());
			author=st.nextToken();
			publisher=st.nextToken();
			
			;
			System.out.println(" Id du book " +id);
			System.out.println(" Title : " + title);
			System.out.println(" Nb pages : " + nbPages);
			System.out.println(" Price : " + price);
			System.out.println(" Author's name : " + author);
			System.out.println(" Publisher's name : " + publisher);
			System.out.println(" ");
	
			line=br.readLine();
		}
		System.out.println(" **************************************");
		br.close();
		}

		public List<Book> readBook(String uri) throws IOException, MediaException
		{
			 List<Book> listBook = new ArrayList<Book>();
			 BufferedReader br = new BufferedReader(new FileReader(uri));
			 String line;
			
			
		
		
			 
			line=br.readLine();
			line=br.readLine(); // To not read the title of column 
			
			System.out.println(" ***************");
			System.out.println(" File Treatment ");
			System.out.println(" ***************");
			
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
				b.setPublisher(p);
				b.addAuthor(a);
				
			   
				line=br.readLine();
				listBook.add(b);
				
			
			
			}
			
			br.close();
			
			return listBook;
		}

}
	

