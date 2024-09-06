package Day17.creationalDesignPattern;

interface fruit {
	void properties();
}

class Apple implements fruit {

	@Override
	public void properties() {
		System.out.println("Red in color + sweet taste");
		
	}
	
}

class Orange implements fruit {

	@Override
	public void properties() {
		System.out.println("Orange in color + tangy taste");
		
	}
	
}

class Mango implements fruit {

	@Override
	public void properties() {
		System.out.println("Yellow color + sour taste");
		
	}
	
}
 
public class FactoryPatternExample {
	
	public fruit createFruit(String type) {
		if(type.equals("Apple")) {
			return new Apple();
		}
		else if(type.equals("Orange")) {
			return new Orange();
		}
		else if(type.equals("Mango")) {
			return new Mango();
		}
		return (fruit) new IllegalArgumentException("Invalid type "+type);
	}
	
	public static void main(String[] args) {
		FactoryPatternExample intance = new FactoryPatternExample();
		fruit apple = intance.createFruit("Apple");
		apple.properties();
		
		fruit orange = intance.createFruit("Orange");
		orange.properties();
		
		fruit mango = intance.createFruit("Mango");
		mango.properties();
		

	}

}
