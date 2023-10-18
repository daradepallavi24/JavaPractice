package packagecom.collectiondemo;


import java.util.LinkedHashMap;

public class LinkedHashMapdemo {

	/*1. The LinkedHashMap class of the Java collections framework 
	provides the hash table and linked list implementation of the Map interface.
	2. The LinkedHashMap interface extends the HashMap class to store its entries in a hash table. 
	It internally maintains a doubly-linked list among all of its entries to order its entries.
	3. capacity - The capacity of this linked hashmap is 8. Meaning, it can store 8 entries.
	loadFactor - The load factor of this linked hashmap is 0.6. This means,
	 whenever our hash map is filled by 60%,the entries are moved to a new hash table
	  of double the size of the original hash table.
	By default,

4.the capacity of the linked hashmap will be 16
   the load factor will be 0.75
	*/
	
	//LinkedHashMap is maintaing the insertion order
	//not allow for duplicate entries for keys
	//no multiple null entries for key
	//only 1 null key can accept
	public static void main(String[] args) {
		
		LinkedHashMap<String, String> linkMap=new LinkedHashMap<String, String>();
		linkMap.put("1", "Tanuja");
		linkMap.put("2", "Pallavi");
		linkMap.put("3", "Vaishnavi");
		linkMap.put("4", "Gayatri");
		linkMap.put("5", "Pratiksha");
		linkMap.put(null, null);
		linkMap.put(null, null); 
		System.out.println(linkMap);
		
		
		LinkedHashMap<String, String> linkMap1=new LinkedHashMap<String, String>();
		linkMap1.putAll(linkMap);
		System.out.println(linkMap1);
		
		

	}

}
