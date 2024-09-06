package generics;

public class BoundedExample {
	public <T extends Number> void display(T num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		BoundedExample obj = new BoundedExample();
		obj.display(142344543.5545D);//double
		obj.display(12);//int/short
		obj.display(23.43f);//float
	}
}
