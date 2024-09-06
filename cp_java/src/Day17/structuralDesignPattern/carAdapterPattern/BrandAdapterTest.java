package Day17.structuralDesignPattern.carAdapterPattern;

public class BrandAdapterTest {

	public static void main(String[] args) {
		BrandAdapter b = new BrandImplAdapter();
		
		Car c1 = b.getBaseModel();
		Car c2 = b.getValkyrieModel();
		
		System.out.println("Car 1 model "+c1.getBrand());
		System.out.println("Car 2 model "+c2.getBrand());
	}
}
