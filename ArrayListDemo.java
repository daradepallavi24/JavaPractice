package packagecom.collectiondemo;


import java.util.ArrayList;
//As ArrayList implements RandomAccess, you can get, set, insert and remove elements of the ArrayList from  any arbitrary position.
//ArrayList is not synchronized. That means, multiple threads can use same ArrayList simultaneously.
public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList<String> arrayList=new ArrayList<String>(); //it is maintatin the insertion order
		arrayList.add("Padmaja");
		//arrayList.add(2);
		arrayList.add("Rajesh");
		arrayList.add("Vishal");
		arrayList.add("Prerna");
		arrayList.add("Rajesh");
		arrayList.add("Rajesh");//6
		arrayList.add("Harish");//7
		arrayList.add("Rajesh");
		arrayList.add("Rajesh"); // Array is allwing dupliacte data
		
		arrayList.set(4, "Pallavi");
		arrayList.set(3, "Vaseem");
		System.out.println("Getting 3th index" + arrayList.get(3));
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		arrayList.add(null);
		//arrayList.add(2.4f);
		//arrayList.add(true);
		System.out.println(arrayList.size());
		arrayList.remove(5);
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		
		
		

	}

}