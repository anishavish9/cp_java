package functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEx {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>(Arrays.asList(11, 22, 33)); // 1st created list
		System.out.println("List with original data: " + list1);

		//Consumer Functional Interface
		Consumer<List<Integer>> product = list -> { 
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i) * 2);
			}
		};
		//calling accept method of the Consumer FI
		product.accept(list1);
		System.out.println("List after applying Consumer accept method: " + list1);
		
		List<String> list2 = new ArrayList<>(Arrays.asList("Java", "C++", "Python"));
		System.out.println("\nList with original data: " + list2);

		
		Consumer<List<String>> product2 = list -> { 
			for (int i = 0; i < list.size(); i++) {
				list.set(i, list.get(i).toLowerCase());
			}
		};
		
		product2.accept(list2);
		System.out.println("To lower case : "+list2);
		
//---------------BiConsumer--------------------
		
		BiConsumer<List<Integer>, List<Integer>> compare = (l1, l2) -> {
			if(l1.size() == l2.size()) {
				System.out.println("True");
			}
			else {
				System.out.println("False");
			}
		};
		
		List<Integer> a = Arrays.asList(2,3,4);
		List<Integer> b = Arrays.asList(5,6);
		compare.accept(a, b);
		
	}

}
