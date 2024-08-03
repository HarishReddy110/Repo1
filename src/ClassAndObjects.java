
public class ClassAndObjects {
	
	String name;
	int age;
	double salary;
	boolean isActive;

	public static void main(String[] args) {
		ClassAndObjects co = new ClassAndObjects();
		co.name="Gurunath";
		co.age=34;
		co.salary=8760.12;
		co.isActive=true;
	
	
	
	
		ClassAndObjects co1 = new ClassAndObjects();
		co1.name="Harsha";
		co1.age=37;
		co1.salary=5460.12;
		co1.isActive=false;
		
	System.out.println(co.name+" "+co.age+" "+co.salary+" "+co.isActive+" ");
	
	System.out.println(co1.name+" "+co1.age+" "+co1.salary+" "+co1.isActive+" ");
	
	
	}
}
 