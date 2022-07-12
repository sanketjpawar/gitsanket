package abstractClass;

public class Aclass3 extends Aclass2 {

	public static void main(String[] args) {
		Aclass3 obj1 = new Aclass3();
		obj1.Messaging();
		obj1.Status();
		obj1.Calls();
		obj1.UPI_Payment();
	}

	@Override
	public void UPI_Payment() {
		System.out.println("UPI Payments added in version 3");	
	}

}
