package prolim.phase1.day2;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment1 {
	
	public static void main (String[] args) {
		LinkedHashSet lhs_1 = new LinkedHashSet();
		LinkedHashSet<Integer> lhs_2 = new LinkedHashSet<Integer>();
		Scanner sc = new Scanner(System.in);
		
		lhs_1.add(101);
		lhs_1.add(31);
		lhs_1.add(10.2f);
		lhs_1.add(9.67f);
		lhs_1.add('A');
		lhs_1.add('z');
		lhs_1.add(true);
		
		System.out.println("Linked hash set 1 elements: " + lhs_1);
		System.out.println("Enter elements:");
		
		for (int i = 0; i < 8; i++) {
			int x = sc.nextInt();
			lhs_2.add(x);
		}
		
		System.out.println("\nLinked hash set 2 elements: " + lhs_2);
		
		TreeSet ths = new TreeSet();

		ths.add("C++");
		ths.add("C");
		ths.add("Python");
		ths.add("Java");
		ths.add("Javascript");
		ths.add("Typescript");
		
		System.out.println("\nTree set elements before removal: " + ths);
		
		ths.remove("Python");
		ths.remove("C++");
		
		System.out.println("\nTree set elements after removal: " + ths);
		
		ths.add("COBOL");
		ths.add("Kotlin");
		ths.add("React");
			
		System.out.println("\nTree set elements after addition of 3 more languages: " + ths);
		System.out.println("Is Java part of the set: " + ths.contains("Java"));
		
		ths.clear();
		System.out.println("\nTree set after clearing: " + ths);
	}
	
}
