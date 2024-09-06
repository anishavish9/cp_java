package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(24,34,60,33,5);
		List<Integer> even = num.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
		System.out.println("Even numbers : "+even);
		
		int total = even.stream().mapToInt(Integer :: intValue).sum();
		System.out.println("Total of even number : "+total);
		
		List<Double> num1 = Arrays.asList(23.5, 56.44, 80.3, 53.94, 70.95);
		Double totalD = num1.stream().mapToDouble(Double :: doubleValue).max().getAsDouble();
		System.out.println("Sum of double value : "+totalD);
		
		List<Double> sortedDouble = 
			num1.stream().sorted().collect(Collectors.toCollection(ArrayList :: new));
		System.out.println("List in sorted order : "+sortedDouble);
		
		//if desecding order
		List<Double> sortedDescDouble = 
				num1.stream().sorted((d1,d2) -> Double.compare(d2, d1)).collect(Collectors.toCollection(ArrayList :: new));
			System.out.println("List in sorted desc order : "+sortedDescDouble);

	}

}
