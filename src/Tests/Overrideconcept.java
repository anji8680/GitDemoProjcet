package Tests;

public class Overrideconcept {
String s="bun";
	static String name="sun";
	
	void details()
	{
		this.s="b";
		this.name="bbnbbb";
		System.out.println(name);
		System.out.println(s);
	}
	
	static void details1()
	{
		Overrideconcept o= new Overrideconcept();
		System.out.println(o.s);
		
	}
	public static void main(String[] args) {
		
		Overrideconcept o= new Overrideconcept();
		System.out.println(o.s);
		o.details();
		Overrideconcept.details1();
		System.out.println(Overrideconcept.name);
	}
	
	

}
