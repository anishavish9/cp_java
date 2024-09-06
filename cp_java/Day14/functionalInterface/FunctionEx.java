package functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hi", "Hello", "How", "oh");
		System.out.println("Greeting");
		System.out.println(list);
		
		Function<String, String> addingE = s -> s + "!";
		List<String> greetings = list.stream().map(addingE).collect(Collectors.toList());
		System.out.println("Greeting with exclamation");
		System.out.println(greetings);
		
		Function<String,Integer> len = s -> s.length();
		List<Integer> lengthOfString = list.stream().map(len).collect(Collectors.toList());
		System.out.println(lengthOfString);
		
		//------------Bifunction----------
		BiFunction<Integer, Integer, Integer> add = (x,y) -> x+y;
		System.out.println(add.apply(3, 5));
		
		BiFunction<Double, Double, Double> addDouble = (x,y) -> x+y;
		System.out.println(addDouble.apply(3454525.5, 645645.34));
	}

}
