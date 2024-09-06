package Day17.structuralDesignPattern.carAdapterPattern;

public class BrandImplAdapter extends Brand implements BrandAdapter{

	@Override
	public Car getBaseModel() {
		Car c = getBrand();
		return getTopModel(c, "Base");
	}

	@Override
	public Car getValkyrieModel() {
		Car c = getBrand();
		return getTopModel(c,"Valkyrie");
	}

	private Car getTopModel(Car c, String string) {
		c.setBrand(c.getBrand().concat(" "+string));
		return new Car(c.getBrand());
	}
	
}
