package prolim.phase1.day3;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String t= "Delhi";  
		String o = "Mumbai"; 
		String k= "delhi";  
		String y= new String ("Mumbai");   
		String l= new String ("delhi");   
		String p = new String("Hello");
		String b = "delhi";
		// Objects in heap = 3
		// Objects in SP = 4
		
		System.out.println(o.equals(l));
		System.out.println(y.equals(p));
		System.out.println(t.equals(o));
		System.out.println(k.equals(y));
		System.out.println(p.equals(y));
		
		System.out.println(o == l);
		System.out.println(y == p);
		System.out.println(t == o);
		System.out.println(k == y);
		System.out.println(p == y);
		System.out.println(b == k);
		
		StringBuffer sb = new StringBuffer("Welcome to");
		System.out.println("Original string: " + sb);
		
		sb.append(" Prolim");
		System.out.println("New String: " + sb);
		
		sb.delete(1, 7);
		System.out.println("New String: " + sb);
		
		System.out.println("Char at position 9 " + sb.charAt(9));
		
		sb.replace(1, 5, "Phase1");
		System.out.println("New String: " + sb);
	}

}
