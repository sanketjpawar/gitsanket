package interfaceStudy;

public class ImplementationClass1 implements Interface1 {

	public static void main(String[] args) {
		
		ImplementationClass1 o = new ImplementationClass1();
		System.out.println("Group 2 subjects are as follows");
		System.out.println("================================");
		o.physics();
		o.chemistry();
		o.english();
		o.comp();
		System.out.println("Total Marks are "+Marks);
	}

	@Override
	public void physics() {
		System.out.println("Compusory Subject 1 is Physics");
	}

	@Override
	public void chemistry() {
		System.out.println("Compusory Subject 2 is Chemistry");
	}

	@Override
	public void english() {
		System.out.println("Compusory Subject 3 is English");	
	}
	
	public void comp() {
		System.out.println("Optional Subject 1 is Computer Science");
	}
	

}
