package prolim.phase1.day2;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main (String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		
		linkedHashMap.put(1, "Samsung");
		linkedHashMap.put(2, "Apple");
		linkedHashMap.put(3, "HCL");
		linkedHashMap.put(4, "DELL");
		
		System.out.println("Contents of linked hash map: " + linkedHashMap);
		System.out.println("Values stored inside map:");
		
		for (Integer key : linkedHashMap.keySet()) {
			System.out.println(key + " " + linkedHashMap.get(key));
		}
		
		System.out.println("Size of linked hash map: " + linkedHashMap.size());
		System.out.println("Is linked hash map empty: " + linkedHashMap.isEmpty());
		System.out.println("Does linked hash map contain 2 as key: " + linkedHashMap.containsKey(2));
		System.out.println("Does linked hash map contain Apple as value: " + linkedHashMap.containsValue("Apple"));
		System.out.println("Remove entry for key 2: " + linkedHashMap.remove(3));
		System.out.println("Contents of linked hash map after removing key 3: " + linkedHashMap);
		
		linkedHashMap.clear();
		System.out.println("Contents of linked hash map after clearing: " + linkedHashMap);
	}
	
}
