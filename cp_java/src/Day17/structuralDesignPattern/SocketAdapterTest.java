package Day17.structuralDesignPattern;

public class SocketAdapterTest {

	public static void main(String[] args) {
		SocketAdapter sockAdapter = new SocketImplAdapter();

        Volt v3 = sockAdapter.get3Volt();
        Volt v12 = sockAdapter.get12Volt();
        Volt v120 = sockAdapter.get120Volt();

        System.out.println("v3 volts using Class Adapter = " + v3.getVolts());
        System.out.println("v12 volts using Class Adapter = " + v12.getVolts());
        System.out.println("v120 volts using Class Adapter = " + v120.getVolts());


	}

}
