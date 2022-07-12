package interfaceStudy;

public class ImplementationClass implements Interface1 {

	public static void main(String[] args) {
		ImplementationClass o = new ImplementationClass();
		System.out.println("Group 1 subjects are as follows");
		System.out.println("==================================");
		o.physics();
		o.chemistry();
		o.english();
		o.maths();
		o.bio();
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
	
	public void maths() {
		System.out.println("Optional subject 1 is Mathematics");
	}
	public void bio() {
		System.out.println("Optional subject 1 is Biology");
	}

}
