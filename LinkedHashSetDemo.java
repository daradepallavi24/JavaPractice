package packagecom.collectiondemo;


import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> evenNumbers = new LinkedHashSet<Integer>();
		evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println(evenNumbers);
			
        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        //bulk entry//union of set
		numbers.addAll(evenNumbers);
		numbers.add(5);
		System.out.println(numbers);
		//tranvese
		Iterator it=numbers.iterator();
		System.out.println("HasSet Using Iterator");
		while(it.hasNext())
		{
			
			char[] a = null;
			System.out.println(a);	
			System.out.println(", ");
		}
		boolean values1=numbers.remove(5);
		System.out.println("Is 5 removes " +values1);
		//all data removed 
		boolean values2=numbers.removeAll(numbers);
		System.out.println("Is all elements are removes " +values2);
		
		
		LinkedHashSet<Integer> evenNumber1=new LinkedHashSet<Integer>();
		// add data
		evenNumber1.add(2);
		evenNumber1.add(4);
		System.out.println("LinkehashSet" + evenNumber1);
		
		LinkedHashSet<Integer> primeNumber=new LinkedHashSet<Integer>();
		primeNumber.add(2);
		primeNumber.add(3);
		//oddNumber.add(5);
		System.out.println("LinkehashSet" + primeNumber);
		evenNumbers.retainAll(primeNumber);
		
		System.out.println("Intersection is: " + evenNumber1);
		
		//Difference of Sets
		
		LinkedHashSet<Integer> oddNumber=new LinkedHashSet<Integer>();
		oddNumber.add(1);
		oddNumber.add(3);
		oddNumber.add(5);
		primeNumber.removeAll(oddNumber);
		System.out.println(primeNumber);
		
		//subset????????????????
		
		
		LinkedHashSet<Integer> num=new LinkedHashSet<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(5); 
		System.out.println("Duplicate data of linkedHashSet"+ num);
		LinkedHashSet<String> str=new LinkedHashSet<String>();
		str.add("Devyani");
		str.add("Bushra");
		str.add("Devyani");
		str.add(null);
		str.add("Devyani");
		str.add("Sakshi");
		str.add("Vidya");
		str.add("Vibhusha");
		str.add("Vikas");
		str.add("Vishal");  //maintaing order
		
		System.out.println("Null data of linkedHashSet"+ str);
	}

}