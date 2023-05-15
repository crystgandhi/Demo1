

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapExample {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(42, "Katty");
		hm.put(45, "George");
		hm.put(92, "Bob");
		hm.put(73, "John");
		hm.remove(73);
		
		System.out.println(hm); 
        System.out.println();
		// print in different ways
		System.out.println(Arrays.asList(hm));
		System.out.println(" ");
		System.out.println(Collections.singletonList(hm));
		System.out.println(" "); 
		hm.forEach((key, value) -> System.out.println(key + " " + value));
                System.out.println(" ");
		System.out.println(Arrays.toString(hm.entrySet().toArray()));
		System.out.println();
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		while (it.hasNext()) {
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println( mp.getKey()+" "+mp.getValue());
			}
	}}

