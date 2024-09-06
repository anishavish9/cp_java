/*
 * Task 1: Generics and Type Safety
	Create a generic Pair class that holds two objects of different types, 
	and write a method to return a reversed version of the pair."
 */

package Day14;

class Pair<T> {
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}

public class Task1_GenericTypeSafety {

	public static void main(String[] args) {
		Pair<String> obj1 = new Pair<>();
		Pair<Integer> obj2 = new Pair<>();
		
		obj1.setT("Malysia");
		System.out.println("Object type string value : "+obj1.getT());
		
		obj2.setT(45);
		System.out.println("Object type integer value : "+obj2.getT());
	}

}
