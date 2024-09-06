package Day17.structuralDesignPattern.carAdapterPattern;

public class Car {
	
	private String brand;

	public Car(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
