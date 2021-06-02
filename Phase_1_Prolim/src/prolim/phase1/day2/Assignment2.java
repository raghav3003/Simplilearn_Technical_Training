package prolim.phase1.day2;

import java.util.Iterator;
import java.util.LinkedList;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("January");
		ll.add("February");
		ll.add("March");
		ll.add("April");
		
		System.out.println("Size of linked list: " + ll.size());
		Iterator<String> itr = ll.iterator();
		
		System.out.println("Printing elements of the list");
		while(itr.hasNext()) {
			System.out.println("Element of list: " + itr.next());
		}
		
		ll.add("September");
		ll.add("October");
		
		System.out.println("\nSize of linked list: " + ll.size());
		itr = ll.iterator();
		
		System.out.println("Printing elements of the list");
		while(itr.hasNext()) {
			System.out.println("Element of list: " + itr.next());
		}
		
		ll.add(4, "May");
		ll.add(5, "June");
		ll.add(6, "July");
		ll.add(7, "August");
		
		System.out.println("\nSize of linked list: " + ll.size());
		itr = ll.iterator();
		
		System.out.println("Printing elements of the list");
		while(itr.hasNext()) {
			System.out.println("Element of list: " + itr.next());
		}
		
		ll.addLast("November");
		ll.addLast("December");
		
		System.out.println("\nSize of linked list: " + ll.size());
		itr = ll.iterator();
		
		System.out.println("Printing elements of the list");
		while(itr.hasNext()) {
			System.out.println("Element of list: " + itr.next());
		}
		
	}

}
