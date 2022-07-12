package AccessSpecifier;

public class AccessSpecifier {

	private void PA() {
		System.out.println("This specifier has private access limited to class");
	}
	
	void Def() {
		System.out.println("This specifier has default access limited to package");
	}
	
	protected void protect() {
		System.out.println("This specifier has protected access limited to package");
	}
	
	public void pub() {
		System.out.println("This specifier is public");
	}
	public static void main(String[] args) {
		AccessSpecifier obj = new AccessSpecifier();
		obj.PA();
		obj.Def();
		obj.protect();
		obj.pub();
		
	}
}
