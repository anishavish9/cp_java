package generics;


class Box<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
public class GenericClass {

	public static void main(String[] args) {
		Box<String> obj1 = new Box<>();
		obj1.setT("java");
		System.out.println(obj1.getT());
		
		Box<Integer> obj2 = new Box<>();
		obj2.setT(23);
		System.out.println(obj2.getT());
		
	}

}
