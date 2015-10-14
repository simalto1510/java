
public class Singleton {

	private Singleton() {}

	private static Singleton instance = null;
	
	public static synchronized Singleton getInstance(){ //synchronized means only one thread can use this methode by itself
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
