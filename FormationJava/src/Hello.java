//import java.util.Date;
import java.util.*;

import com.m2i.formation.media.entities.*;
import com.m2i.formation.media.repositories.BookRepository;

import java.io.*;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("Hello world"); 
		
		/******************************************/
/*		int i = 10;
		int j = 20;
		int nouv;
		
		System.out.println("i =" +i);
		System.out.println("j =" +j);
		nouv = i;
		i = j;
		j = nouv;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    	
		System.out.println("Nouveau valeur de i : " + i);
		System.out.println("Nouveau valeur de j : " + j); **/
		
		//
	/*	String s = "toto"; 
		System.out.println(s); */
		
		/* condition **/
		/* TP3 ***/
		/* Dans main
		 * 
		 Afficher les chiffres de 0 à 99
		 afficher 10 9 8 ..321 BOOM
		 afficher les puiissances de 2 sans utiliser l'operateur* 
		 puissance 2 4 8 16 32...1024
		 
		 bonus afficher les 50 premiers nombre premiers
		 **/ 
////////////////////////////////////////////////////////////////////////////////////
		//1
/*	for(int l=0; l<100; l++){
			System.out.print(l+ " "); //Afficher les uns parmi les autres
		}
		System.out.println();**/
		//2
	/*	System.out.println("Compte à rebours");
		int c= 10;
		while (c > 0)
		{
			System.out.print(c+ " ");
			c = c - 1;
		}
		System.out.println("BOOM");**/
			
		//3
		
/*	   int d = 2;
	   final int MAX= 1024;
	   System.out.println("Les puissances de 2 sont : ");
	   
	   while ( d <= MAX)
	   {
		   System.out.print(d+ " ");
		   d *= 2; 
	   }
	   System.out.println();**/
	   
	/* Coorection nombre premier***/   
	   //4
	    
// final int NBRPREM = 500; // Les nombre des nombres premiers à trouver
	/*   int toTest = 2; 
	   int compteur = 0;
	   for (int n= 0; n < NBRPREM; n++ ){
		   boolean isPrime = true;
		   j = 2;
		   while(isPrime && j<toTest) //Tant que je n'ai pas un nombre premier
		   	{
			   if( toTest % j == 0){
						   isPrime = false;
					   }
					j++;
			}
			if(isPrime) { 
				if (compteur <50){ //Compteur pour afficher 50 premiers des nombres premiers
					System.out.println(toTest);
					compteur++;
				}
				else{
					n = 500; //pour sortir de la boucle aprés avoir trouver les 50 premiers des nombres presmiers
				}
			}
			toTest++;
		}
		
	   int v= 20;
	   int w=30;
	   int result = add(v,w);
	   System.out.println("Le resultat de l'addition " + result); **/
////////////////////////////////////////////////////////////////////////////////////	   
	   // TP Tableaux
	   //
/*	System.out.println("|*****************************************| ");
		System.out.println("         TP sur les tableaux                ");
		System.out.println("|*****************************************| ");
		System.out.println(" ");
	   int[] tab = {1,-20,30,40,-5,6,9,8,59,-89};
	   display(tab);
	   System.out.println(" ");
	   
	   final int ECHELLE = 10; //Nombre d'elements du tableau qu'on peut modifier pour avoir le nombre voulu
	   int RES = 0;
	   double moyenne;
	   int MAXI;
	   int MINI;
	   tab = new int[ECHELLE]; **/
		
	   
	/*   Remplir_random(tab);
	   display(tab);
	   System.out.println(" ");
	   
	   MAXI=max(tab);
	   System.out.println("Le nombre maximum du tableau est " + MAXI);
	   
	   MINI=min(tab);
	   System.out.println("Le nombre minimum du tableau est " + MINI);
	   
	   RES = sum(tab);
	   System.out.println("La somme du tableau est " + RES);
	   
	   moyenne = average(tab);
	   System.out.println("La moyenne des valeurs du tableau est " + moyenne);
	   System.out.println(" ");
	   **/
/*	  int value = 100;
	  final int value2 = 111;
	   int index = 3;
	   int index1 = 1;
	   int index2 = 4;
	   put(tab,index,value);
	   display(tab);
	   
	   permut(tab,index1,index2);
	   display(tab);
	   
	   permut2(tab,2);
	   display(tab); **/
	/*   
	   System.out.println("remove " );
	  // int[] tabnew=new int[tab.length-1];
	   //tabnew= remove(tab,4);
	   remove(tab,4);
	   //display(tabnew);
	   display(tab);
	   
	   System.out.println("Insert " );
	   insert(tab,3,value2);
	   display(tab);
	   
	   System.out.println("clone tableau " );
	   int[] tab2=new int[tab.length];
	   tab2=clone(tab);
	   display(tab);
	   display(tab2); //display(clone(tab));
	   
	   System.out.println("EVEN " );
	   int[] tab3=new int[tab.length];
	   tab3=even(tab);
	   display(tab);
	   display(tab3);
	   
	   System.out.println("Inverse " );
	   int[] tab4=new int[tab.length];
	   tab4=inverse(tab);
	   display(tab);
	   display(tab4);
	   
	   System.out.println("REMOVE 2 " );
	   int[] tab5=new int[tab.length-1];
	   tab5= remove2(tab,2);
	   display(tab);
	   display(tab5);
	   
	   System.out.println("INSERT 2 " );
	   int[] tab6=new int[tab.length+1];
	   tab6= insert2(tab,2,222);
	   display(tab);
	   display(tab6);
	   
	   System.out.println("Tri Bulle " );
	   int[] tab7=new int[tab.length];
	   tab7 = clone(tab);
	   Sortbubble(tab7);
	   display(tab);
	   display(tab7);
	   System.out.println(" ");
	   
	   System.out.println("Tri Bulle " );
	   int[] tab8=new int[tab.length];
	   tab8 = clone(tab);
	   tab8=Tri_min(tab8);
	   display(tab);
	   display(tab8);
	   System.out.println(" ");
	   
	   System.out.println("Factorielle " );
	   final int NOMBRE = 3;
	   int fact = Factorielle(NOMBRE);
	   System.out.println("Factorielle est  " + fact);
	   System.out.println(" ");
	   
	   System.out.println("SOMME RECURSIF " );
	   int incremente = 0;
	   int Somme = Somme_recursif(tab,incremente);
	   System.out.println("Somme est  " + Somme);
	   System.out.println(" ");
	  
	   System.out.println("|*************************************************************| ");
	   System.out.println("           LA FIN du TP sur les tableaux                        ");
	   System.out.println("|*************************************************************| ");
	   System.out.println(" ");**/
//Define books	   
	/*Book b = new Book();
	  b.setId(12345678);
	  b.setIsbn(1877309916);
	  b.setLang("chinese");
	  b.setTitle("Grenouilles");
	  b.setPrice(19.20);
	  b.setNbPage(200);
	  b.setCategory(BookCategory.Computer);
	  b.getDate();

	  Book b1 = new Book();
	  b1.setId(10230);
	  b1.setIsbn(14451253);
	  b1.setLang("Japanese");
	  b1.setTitle("Yokohama");
	  b1.setPrice(10.20);
	  b1.setCategory(BookCategory.SF);
	  b1.setNbPage(500);

	  b1.getDate();
//Define publishers  
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
//Define authors

	  
	  Author a= new Author();
	  a.setFirstname("Mo");
	  a.setLastname("Yo");
	  
	  Author a1= new Author();
	  a1.setFirstname("Louis");
	  a1.setLastname("Floop");
	  
	  Author a2= new Author();
	  a2.setFirstname("Marc");
	  
	  a2.setLastname("Lopez");
	  
	  
	  b.setPublisher(p);
	  b1.setPublisher(p1);
	//On  
	  try {
		b.addAuthor(a);
		b1.addAuthor(a1);
		b1.addAuthor(a2);  
	  	} 
	  catch (MediaException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();//if I get this kind of error I execute this action otherwise I do the action above
	  }
	 
	  
	  System.out.println(" ");
	  System.out.println(" The first book : " );
	 
	  b.afficher();
	  
	  
	  System.out.println(" ");
	  System.out.println(" The second book : " );
	 
	  b1.afficher(); 
	  
	//Cd 
	  
  
	  Publisher p2 = new Publisher();
	  p2.setNom("Jam Records");
	  p2.setPays("USA");
	  p2.setSiret(1333333);
	  p2.setEmail("jamrecordsUSA@gmail.fr");
	  
	  
	  Cd c=new Cd();
	  c.setId(11135);
	  c.setPrice(17.6);
	  c.setPublisher(p2);
	  c.setNbTrack(20);
	  c.setTitle("Documentary");
	  c.afficher();
	 
	  
	  Dvd d= new Dvd();
	  d.setId(12222);
	  d.setPrice(30.6);
	  d.setPublisher(p2);
	  d.setRegion(20);
	  d.setTitle("Hitch");
	  d.afficher(); */
	  
	 //polymorphism's basics
	/*  Media m=new Book();
	  m.setPrice(10);
	  double pricenew =m.getVATPrice();
	  System.out.println(" New price : " +pricenew);*/
	  
	  
	  
	  
	  
	/*  System.out.println(" ");
	  Counter c1 = new Counter();
	  Counter c2 = new Counter();
	  
	  System.out.println( "\nCounter C1 : " + c1.increment()+ " "+ c1.increment()+" " + c1.increment());
	  System.out.println( "\nCounter C2 : " + c2.increment()+ " "+ c2.increment()+" " + c2.increment());
	  
	  //Same as:
	  System.out.println( " \nCounter : " + Counter.increment()+ " "+  Counter.increment()+" " +  Counter.increment());
      **/
	  
	  
	/*  Book b4 = new Book();
	  b4.setTitle("Laugh");
	  Book b5 = new Book();
	  b5.setTitle("Low");
	  
			  
	  Book b6 = new Book();
	  b6.setTitle(b1.getTitle());
	  System.out.println(" ");
	  if ( b4 == b6){
		  System.out.println(" Those two books "+ b4.getTitle()+" and "+ b6.getTitle()+" are alike ");
	  }
	  else{
		  System.out.println(" Those two books "+ b4.getTitle()+" and "+ b6.getTitle()+" are Different ");
	  }
			 
		
		
//Test sur la liste
	
  CollectionTest listOut= new CollectionTest();
	List<Book> listB = listOut.listTest();
	Set<Book> SetB = listOut.setTest();
	Map<Integer, Book> m = listOut.mapTest();
	Book b7=new Book();
	b1.getDate();
	
    System.out.println(" \n ListBooks : ");
	 for (Book bNouv:listB){
		 bNouv.afficher();
	 }
	
      System.out.println(" \n SetBooks : ");
	 
	 for (Book bNouv:SetB){
		 bNouv.afficher();
	 }	
	 System.out.println(" \n  ");
	
	System.out.println(" \n MapBooks : ");
	
	b7 =m.get(123);
	for(int key: m.keySet()){
		 System.out.println(key);
		 System.out.println(m.get(key));
		 
	}
		
		
		
Cart cartList = new Cart();
	Media b8=new Book();
    b8.setPrice(10);
    
    Media cd=new Cd();
    cd.setPrice(11);
    
    Media dvd = new Dvd();
    dvd.setPrice(11);
    
    cartList.getMedias().add(b8);//getMedias return a list of type Media thus we have access
    cartList.getMedias().add(cd);// to different of List Media
    cartList.getMedias().add(dvd);
    
  
    double result = cartList.getVATPrice();
    
    
    System.out.println(" \n VAT Price : "+ result);
		/*String machaine ="3";
		int monentier= Integer.getInteger(machaine);
		monentier = Integer.parseInt(machaine);
		Integer.toString(monentier);*/
		
//File Treatment
		
	    BookRepository bp = new BookRepository();
		List<Book> listBook = new ArrayList<Book>();
		//Book bTest = new Book();
		String wordTest = "Conte";
		
		try {
			
			bp.setUri("C:\\Users\\adminlocal\\Desktop\\Booklist.csv");
			/*listBook=bp.getAll();
			System.out.println(" \n ListBooks : ");
			 for (Book bNouv:listBook){
				 bNouv.afficher();
			 }
			 System.out.println("***************************** ");
			 bTest = bp.getById(3);
			 System.out.println(" \n Book choisi par son id n°" +bTest.getId());
			 bTest.afficher();
			 System.out.println("***************************** "); 
			 listBook= bp.getByPrice(17);
			 System.out.println(" \n Book choisi par son Price : 20");
			 for (Book bNouv1:listBook){
				 bNouv1.afficher();
			 }
			 System.out.println("***************************** ");*/
			 listBook= bp.getByTitle(wordTest);
			 System.out.println(" \n Book choisi par son titre : " +wordTest);
			 for (Book bNouv2:listBook){
				 bNouv2.afficher();
			 }

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MediaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		//Singleton singleton = Singleton.getInstance();
		
     
	}
	
	
	//Toutes les Fonctions 
	//1: La fonction add
	/**
	 * 
	 * @param n premier opérande
	 * @param m deuxieme opérande
	 * @return somme de n et m
	 */
	public static int add(int n, int m){
		return n+m;
	}
////////////////////////////////////////////////////////////////////////////////////
	// la fonction display qui affiche les valeurs dyu tableau
	public static void display(int[] table){
		System.out.println("Les valeurs du tableau sont : ");
		for (int i=0; i< table.length; i++){
			System.out.print(table[i] + " "); //Affichage en ligne
			}
		System.out.println(" "); // espace pour avoir elements afficher en ligne
		}
////////////////////////////////////////////////////////////////////////////////////
	// La fonction SOMME
	public static int sum(int[] tab){
		int total = 0;
		for (int i=1; i< tab.length; i++){
			total = tab[i] + total;
			//total += tab[i];
			}
		return total;
		}
////////////////////////////////////////////////////////////////////////////////////	
	//La fonction MAX qui renvoie la valeur max du tableau et MIN, la valeur minimale
	
	public static int max(int[] tab){
		int MAX;
		MAX = tab[0];
		for (int i=0; i< tab.length; i++){
			if (MAX < tab[i]){
					MAX = tab[i];
				}
			}
		return MAX;
		}
	////////
	public static int min(int[] tab){
		int MIN;
		MIN = tab[0];
		for (int i=0; i< tab.length; i++){
			if (MIN > tab[i]){
					MIN = tab[i];
				}
			}
		return MIN;
		}
////////////////////////////////////////////////////////////////////////////////////
	// La fonction MOYENNE qui renvoie la valeur moyenne du tableau
	public static double average(int[] tab){
		double average;
		average = sum(tab);
		average = average/tab.length;
		return average;
		}
	/* autre façon d'écrire cette fonction 
	public static double average1(int[] tab){
		return ((double) sum(tab))/tab.length;
		}**/
	
////////////////////////////////////////////////////////////////////////////////////
	//Lan fonction remplir_random qui remplit le tableau aleatoirement
	public static void Remplir_random(int[] tab){
		final int MAXRANGE = 100;
		Random rnd; //objet (instance de class) qui permet de generer des valeurs reels entre 0 et 1.
		rnd = new Random();
		for (int i=0; i< tab.length; i++){
			tab[i] = rnd.nextInt(MAXRANGE); // le 100 permet de fixer l'echelle de nos soit (0*100....1*100) donc[0..99]
			}
		}
	//autre façon d'écrire cette fonction
/*	public static int[] createRandomlyTab(int length){
		int[] tab = new int[length];
		Random rnd = new Random();
		for (int i=0; i< tab.length; i++){
			tab[i] = rnd.nextInt(100);
		}
		return tab;**/
////////////////////////////////////////////////////////////////////////////////////
	// La fonction PUT qui permet de remplace une valeur de tableu en donnant son indice et sa nouvelle valeur
	public static void put(int[] tab, int index, int value){
		tab[index]=value;
	}
///////////////////////////////////////////////////
	// la fonction permut permute des valeurs d'un meme tableau
	public static void permut(int[] tab, int index1, int index2){
		int change;
		change = tab[index1];
		tab[index1]=tab[index2];
		tab[index2]=change;
	}
//////////////////////////////////////////////////////////////
	// La fonction permut permute la valeur d'un tableau avec l'element precedent
	public static void permut2(int[] tab, int index){
	/*	int change;
		int decale;
		decale = index - 1; //l'indice du valeur à remplacer à tab[indice]
		change=tab[index]; //on garde la valeur de l'index à decaler à + 1 de pas
		tab[index]= tab[decale]; // on remplace tab[indice] par la valeur tab[indice+1]
		tab[decale]=change; // on recopie la valeur  de tab[indice] sauvergardée dans change **/
		permut(tab,index,index-1);
	}
////////////////////////////////////////////////////////////////
	// la fonction remove qui suprime la valeur de l'indice donné
/*	public static int[] remove(int[] tab, int index){
		int longueur;
		longueur = tab.length - 1;
		int[] tabchange = new int[longueur];
		for (int i=0; i< tabchange.length; i++){
			if(i < index){
					tabchange[i] = tab[i];//on recopie si on n'a pas encore atteint l'indice dans l'ordre croissant
				}
			else{
					tabchange[i] = tab[i+1]; // sinon on recopie la valeur de tab[indice+];
				}
			}
		return tabchange;
	} **/
	// autre façon de faire remove
	public static void remove(int[] tab, int index){
		for (int i=index; i< tab.length-1; i++){
			tab[i] = tab[i+1];
		}
	}
/////////////////////////////////////////////////////////////////////	
//la fonction Insert 	
	
	public static void insert(int[] tab, int index, int value){
		for (int i=tab.length - 1; i> index; i--){
			tab[i] = tab[i-1];  // c'est linverse de la fonction remove
		}
		put(tab,index,value);
	}
///////////////////////////////////////////////////////////////////////
	//La fonction Clone(en creant un new tableau)
	public static int[] clone(int[] tab){
		int[] tabnew = new int[tab.length];
		for (int i=0; i< tabnew.length; i++){
			tabnew[i] = tab[i];
		}
		return tabnew;
	}
////////////////////////////////////////////////////////////////////////
	//La fonction EVen qui cree un new tableau des valeurs pair
	public static int[] even(int[] tab){
		int[] tabnew = new int[tab.length];
		int i2 = 0; //indice permettant de remplir les nombres paires aux premieres valeurs du tab
		for (int i=0; i< tabnew.length; i++){
				if(((tab[i]%2) == 0) ){	
					tabnew[i2] = tab[i];
					i2++;
			}
		}
		return tabnew;
	}
	
////////////////////////////////////////////////////////////////////////
//La fonction inverse qui inverse un tableau
	
	public static int[] inverse(int[] tab){
		int[] tabnew = new int[tab.length];
		int j = 0;
		for (int i=tabnew.length-1; i>=0; i--){
			tabnew[j] = tab[i]; // On ne remplit le new tab que si on a un nombre pair
			j++; //puis on incremente son indice
		}
		return tabnew;
	}
	//Autre façon d'ecrire Inverse
	/*	public static int[] inverse2(int[] tab){
			int[] tabnew = new int[tab.length];
			for(int i=0; i <tab.length;i++){
				tabnew[tab.length -1 -i] = tab[i];
			}
			return tabnew; 
		}**/
////////////////////////////////////////////////////////////////////////
//La fonction remove 2
	public static int[] remove2(int[] tab, int index){
		int[] tabnew = new int[tab.length-1];
		for (int i=0; i< tabnew.length; i++){
			if(i < index){
				tabnew[i] = tab[i];//on recopie si on n'a pas encore atteint l'indice dans l'ordre croissant
			}
			else{
					tabnew[i] = tab[i+1]; // sinon on recopie la valeur de tab[indice+];
				}
		}
		return tabnew;
	}
	
////////////////////////////////////////////////////////////////////////
//La fonction insert 2
	public static int[] insert2(int[] tab, int index,int value){
		int[] tabnew = new int[tab.length+1];
		
		for (int i=tab.length; i> index; i--){
				tabnew[i] = tab[i-1]; //On commence à lire le tab d'origine par la fin 
		}							//On remplit la valeur le nouveau tableau par la fin jusquu'à la case index.
		
		put(tabnew,index,value);  //On remplit la la nouvelle valeur dans la case index du new table
		
		for (int i=0; i < index; i++){
			tabnew[i] = tab[i];    // On recopie le new tab du debut jusqu'à index-1 par les valeurs du tab ancien.
		}
		return tabnew;
	}
	
	//Autre façon de faire insert2
	public static int[] insert3(int[] tab, int index,int value){
	 		int[] tabnew = new int[tab.length+1];
	 		for (int i=0; i< index; i++){
	 			tabnew[i] = tab[i];
	 		}
	 		tabnew[index] = value;
	 		for (int i=index; i< tab.length; i++){
	 			tabnew[i+1] = tab[i];
	 		}
	 		
	 		return tabnew;
	 	}
////////////////////////////////////////////////////////////////////////
//LA Fonction bubble sort qui trie le tableau en prennant les valeurs de celui-ci deux à deux
	public static void Sortbubble(int[] tab){
		int k = tab.length;
		for (int i = tab.length; i>0; i--){
			for (int j = 0; j > (k-1); j++ ){
				if ( tab[j] > tab[j+1]){
						permut2(tab,j+1);	
					}
			}
			k = k - 1;
		}
 	}
////////////////////////////////////////////////////////////////////////
//LA Fonction tri max // Qui ne fonctionne pas bien
	public static int[] Tri_min(int[] tab){
		int[] tabnew = new int[tab.length];
		int[] tabclone = new int[tab.length];
		tabclone= clone(tab);
		int MIN = 0;
		int MAX = max(tab) +1;
		int index =0;
		for (int i = 0; i< tabclone.length;i++){
			//deuxieme boucle for pour 
			MIN = min2(tab,index);
			if (MIN <= tab[i]){
				tabnew[i]=MIN;
				MIN=MAX+1;
			}
		}
		return tabnew;
	}

	
////////////////////////////////////////////////////////////////////////
	//LA fonction factorielle
	public static int Factorielle(int n){
		if (n == 0){
			return 1;
		}
		else{
			return n * Factorielle( n-1);
		}
			
	}
////////////////////////////////////////////////////////////////////////
	//LA somme recursif;
	public static int Somme_recursif(int[] tab, int i){
		if ( i == tab.length){
			
			return 0;
		}
		else{
			return tab[i++] + Somme_recursif(tab,i);
			}
	}
///////////////////////////////////////////////////////////////////////
	//indice du min
	public static int Indice(int[] tab){
		int index=0;
		int MIN = min2(tab, index);
		System.out.println("  " + MIN);
		return index;
	
	}

	public static int min2(int[] tab, int index){
		int MIN;
		MIN = tab[0];
		for (int i=0; i< tab.length; i++){
			if (MIN > tab[i]){
					MIN = tab[i];
					tab[i]=MIN+800;
				}
			}
		return MIN;
		}
}
 

 