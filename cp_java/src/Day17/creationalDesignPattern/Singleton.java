package Day17.creationalDesignPattern;

public class Singleton {
	
	private static Singleton obj;
	
	private Singleton() { //private constructore
		
		
	}
	
	public static Singleton getInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}
	
	public static void main(String[] args) {
		
		Singleton instance = Singleton.getInstance();
		System.out.println("Singleton intance "+ instance);
		Singleton instance1 = Singleton.getInstance();
		//print same as instance only one instance is created
		System.out.println("Singleton intance "+ instance1);
	
	}

}
