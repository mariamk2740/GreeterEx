
public class GreeterClass {

	
	private String name = "Marmm";
	private int age = 18;
	
	public GreeterClass () {
		name = "mam";
		age = 18;
	}
	
	public GreeterClass (String xname, int xage) {
		name = xname;
		age = xage;
	}
	
	public String toString() {
		return "Greeter:" + name + age;
	}
	
	
}
