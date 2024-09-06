package Day17.behaviouralDesignPattern.strategyPattern;

public class Product {
	
	private String pCOde;
	private double pPrice;
	
	public Product(String pCOde, double pPrice) {
		super();
		this.pCOde = pCOde;
		this.pPrice = pPrice;
	}

	public String getpCOde() {
		return pCOde;
	}

	public double getpPrice() {
		return pPrice;
	}
	
}
