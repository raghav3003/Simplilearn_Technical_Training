package prolim.phase1.core.p1;

public class N {
	
	protected long var_protected = 1000L;
	public int var_public = 1000;
	double var_default = 12.56;
	
	public void methodPublic() {
		System.out.println("Inside public method of class N");
	}
	
	private void methodPrivate() {
		System.out.println("Inside private method of class N");
	}
	
	void methodDefault() {
		System.out.println("Inside default method of class N");
	}
	
	protected void methodProtected() {
		System.out.println("Inside protected method of class N");
	}
	
	public void printVariables() {
		System.out.println("Protected long: " + var_protected);
		System.out.println("Public int: " + var_public);
		System.out.println("Default double: " + var_default);
	}
	
	public void callProtected() {
		methodProtected();
	}
	
	public void callPrivate() {
		methodPrivate();
	}
	
	public void callDefault() {
		methodDefault();
	}
	
}

