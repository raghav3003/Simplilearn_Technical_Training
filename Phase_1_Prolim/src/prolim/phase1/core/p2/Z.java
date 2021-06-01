package prolim.phase1.core.p2;
import prolim.phase1.core.p1.*;

public class Z extends M {
	
	public static void main (String[] args) {
		N objN = new N();
		Z objZ = new Z();
		X objX = new X();
		P objP = new P();
		
		System.out.println("Calling methods of class N");
		objN.methodPublic();
		objN.callProtected();
		objN.callDefault();
		objN.callPrivate();
		
		System.out.println("\nCalling methods of class M");
		objZ.methodPublic();
		objZ.methodProtected();
		objZ.callDefault();
		objZ.callPrivate();
		
		System.out.println("\nCalling variables of class X");
		System.out.println("Public variable: " + objX.var_public);
		System.out.println("Protected variable: " + objX.var_protected);
		System.out.println("Default variable: " + objX.var_default);
		System.out.println("Private variable: " + objX.callPrivate());
	
	}
	
}
