package generics;

public class GenericMethod {
	
	public static <T> void show(T[] x) {
		for(T t : x) {
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		String arr[] = {"yhyj", "java", "name"};
		Integer n[] = {1,2,3,5};
		show(arr);
		show(n);

	}

}
