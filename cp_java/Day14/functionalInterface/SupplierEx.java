package functionalInterface;

import java.util.function.Supplier;

public class SupplierEx {

	public static void main(String[] args) {
		Supplier<Double> randomValue = () -> Math.random();
		  
        // Print the random value using get()
        System.out.println(randomValue.get());


	}

}
