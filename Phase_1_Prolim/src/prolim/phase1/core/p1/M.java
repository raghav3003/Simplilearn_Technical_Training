package prolim.phase1.core.p1;

public class M {
	
	protected float var_protected = 10.001f;
	private int var_private = 1000;
	long var_default = 1256L;
	
	public void methodPublic() {
		System.out.println("Inside public method of class M");
	}
	
	private void methodPrivate() {
		System.out.println("Inside private method of class M");
	}
	
	void methodDefault() {
		System.out.println("Inside default method of class M");
	}
	
	protected void methodProtected() {
		System.out.println("Inside protected method of class M");
	}
	
	public void printVariables() {
		System.out.println("Protected float: " + var_protected);
		System.out.println("Private int: " + var_private);
		System.out.println("Default long: " + var_default);
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
