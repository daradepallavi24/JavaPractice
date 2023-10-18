package packagecom.collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
// Map is not belong to collection framework hirichy
//It accept the data in key and value pair
//u can provide any datatype as key and value pair
//u can provide multiple null values
//u can provide multiple duplicate values 
//u can not provide duplicate key
//u can provide only 1 null as key.
//HashMap is not maintaing the insertion order
/*8 (capacity is 8) - This means it can store 8 entries.
0.6f (load factor is 0.6) - This means whenever our hash table is filled by 60%, 
the entries are moved to a new hash table double the size of the original hash table.
If the optional parameters not used, then the default capacity will be 16 and the default 
load factor will be 0.75.*/
public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map=new HashMap<Integer, String>();
		// adding the data
		map.put(11,"Padmaja");
		map.put(3, "Ayyan");
		map.put(6, "Sakshi");
		map.put(17, "Rajesh");
		map.put(5, "Satyam"); // duplicate for the vlaue is allow
		map.put(1,"Padmaja");
		map.put(8, "Ayyan");
		map.put(9, "Sakshi");
		map.put(10, "Pallavi");
		System.out.println(map);
		//accessing the data
		String value=map.get(1);
		System.out.println(value);
		//provide the set of a key
		System.out.println(map.keySet());
		//provide the vlaues
		System.out.println(map.values());
		// complte entry set
		System.out.println(map.entrySet());
		
		System.out.println(map.replace(1, "pallavi"));
		System.out.println(map);
		
		System.out.println(map.remove(9));
		System.out.println(map);
		//iterate through key only
		for(Integer key : map.keySet())
		{
			System.out.println(key);
			System.out.println(", ");
		}
		//iterate through Values only
		for(String value1 : map.values())
		{
			System.out.println(value1);
			System.out.println(", ");
		}
		//iterate through kay/values only
		for(Entry<Integer, String> entry : map.entrySet())
		{
			System.out.println(entry);
			System.out.println(", ");
		}
		
		/*
		 * Iterator it=map.iter
		 * 
		 * Iterator<String> iterator = list.iterator();
		 * 
		 * while (iterator.hasNext()) { iterator.next();
		 * 
		 * //Removing an element iterator.remove(); }
		 * 
		 * System.out.println(list);
		 */
	}

}