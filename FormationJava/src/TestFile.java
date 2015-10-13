import java.util.*;

import com.m2i.formation.media.Author;
import com.m2i.formation.media.Book;
import com.m2i.formation.media.Publisher;

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
		int i = 1;
		
		line=br.readLine();
		line=br.readLine(); // To not read the title of column 
		
		System.out.println(" ***************");
		System.out.println(" File Treatment ");
		System.out.println(" ***************");
		while(line!=null) {
			// treatment
			
			//read the line of the file 
			StringTokenizer st = new StringTokenizer(line,";");
			
			i++;
			title = st.nextToken();
			nbPages= Integer.parseInt(st.nextToken());
			price= Double.parseDouble(st.nextToken());
			//nbPages=st.nextToken();
		//	price= st.nextToken();
			author=st.nextToken();
			publisher=st.nextToken();
			
			;
			System.out.println(" information of Book n° " +i);
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

		public List<Book> readBook(String uri) throws IOException
		{
			 List<Book> listBook = new ArrayList<Book>();
			 Book b = new Book();
			 Author a= new Author();
			 Publisher p= new Publisher();
			 BufferedReader br = new BufferedReader(new FileReader(uri));
			 String line;
			 int i=1;
		
			 
			line=br.readLine();
			line=br.readLine(); // To not read the title of column 
			
			System.out.println(" ***************");
			System.out.println(" File Treatment ");
			System.out.println(" ***************");
			
			while(line!=null) {
				// treatment
				
				//read the line of the file 
				i++;
				StringTokenizer st = new StringTokenizer(line,";");
				b.setTitle(st.nextToken());
				b.setNbPage(Integer.parseInt(st.nextToken()));
				b.setPrice(Double.parseDouble(st.nextToken()));
				a.setFirstname(st.nextToken());
				p.setNom(st.nextToken());
			   
				line=br.readLine();
				listBook.add(b);
			
			
			}
			br.close();
			
			return listBook;
		}

}
	

