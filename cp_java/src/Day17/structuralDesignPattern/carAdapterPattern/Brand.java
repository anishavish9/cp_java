package Day17.structuralDesignPattern.carAdapterPattern;

public class Brand {
	
	public Car getBrand() {
		return new Car("Aston Martin");
	}
}
