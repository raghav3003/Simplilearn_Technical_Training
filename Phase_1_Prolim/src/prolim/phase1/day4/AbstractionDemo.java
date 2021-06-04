package prolim.phase1.day4;

abstract class MNC {
	
	MNC () {
		System.out.println("Inside MNC class");
	}
	
	public void companyType() {
		System.out.println("Company type: MNC");
	}
	
	public abstract void companyName();
	public abstract void numberOfEmployees();
	
}

abstract class Infosys extends MNC {
	
	public void companyName() {
		System.out.println("Company name: Infosys");
	}
	
}

class Hello extends Infosys {

	public void numberOfEmployees() {
		System.out.println("Number of employees: 10000");
	}
	
	public void display() {
		System.out.println("Hello class");
	}
	
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Infosys obj1 = (Hello) new Hello();
		Hello obj2 = new Hello();
		
		obj1.companyType();
		obj1.companyName();
		obj1.numberOfEmployees();
		
		obj2.companyType();
		obj2.companyName();
		obj2.numberOfEmployees();
		obj2.display();
	}

}
