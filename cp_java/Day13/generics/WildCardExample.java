package generics;

import java.util.ArrayList;
import java.util.List;

public class WildCardExample {

	public static void show(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("java");
		list1.add("python");
		
		List<Integer>  list2 = new ArrayList<>();
		list2.add(12);
		list2.add(45);
		
		show(list1);
		show(list2);
	}

}
