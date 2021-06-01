package prolim.phase1.core.p2;
import prolim.phase1.core.p1.*;

public class Y extends N {

	public static void main (String[] args) {
		Y objY = new Y();
		M objM = new M();
		X objX = new X();
		
		System.out.println("Calling methods of class N");
		objY.methodPublic();
		objY.methodProtected();
		objY.callDefault();
		objY.callPrivate();
		
		System.out.println("\nCalling methods of class M");
		objM.methodPublic();
		objM.callProtected();
		objM.callDefault();
		objM.callPrivate();
		
		System.out.println("\nCalling variables of class X");
		System.out.println("Public variable: " + objX.var_public);
		System.out.println("Protected variable: " + objX.var_protected);
		System.out.println("Default variable: " + objX.var_default);
		System.out.println("Private variable: " + objX.callPrivate());
	
	}
	
}
