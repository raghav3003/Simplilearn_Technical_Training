package prolim.phase1.core;

public class TypecastExample {

	public static void main(Integer[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Running overloaded main method with the arguments: " + args[0] + ", " + args[1]);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Running original main method");
		Integer[] arguments = new Integer[2];
		arguments[0] = 1;
		arguments[1] = 10;
		main(arguments);
	}

}
