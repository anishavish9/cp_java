package lambda;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Operate<T> {
	//abstract method
	T calculate(T a, T b);
}

public class Operations {

	public static void main(String[] args) {
		Operate<Integer> rf = (a, b) -> a + b;
        System.out.println(rf.calculate(25, 35));

        Operate<Double> rf1 = (a, b) -> a + b;
        System.out.println(rf1.calculate(25.789, 35.567));

        Operate<String> rf3 = (a, b) -> a + b;
        System.out.println(rf3.calculate("356", "456"));
        
        List<Integer> l1 = new ArrayList<>();
        l1.add(345);
        l1.add(45435345);
		l1.forEach(p -> {System.out.println(p);});

	}

}
