package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("Ram", "Sita", "Shyam", "Sam");
		Predicate<String> withS = list -> list.startsWith("S");
		List<String> names = l1.stream().filter(withS).collect(Collectors.toList());
		System.out.println(names);
		
		Predicate<String> len1 = l2 -> l2.length() > 3;
		List<String> len2 = l1.stream().filter(len1).collect(Collectors.toList()); 
		System.out.println(len2);
		
		
//-------------------Bipredicate-----------------------
		BiPredicate<Integer, Integer> greater = (x,y) -> x>y;
		System.out.println("Is the number grater or not "+greater.test(50, 40));
 	}

}

