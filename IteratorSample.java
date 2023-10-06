package packagecom.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Iteration Using Normal for loop.
//Iteration Using Iterator Object.
//Iteration Using ListIterator Object.
//Using enhanced for loop
public class IteratorSample {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ar.add("First");
		ar.add("Second");
		ar.add("Third");
		ar.add("Fourth");
		ar.add("Fifth");
		ar.add(17);
		
		
		System.out.println(ar);
		
		ArrayList<String> arList=new ArrayList<String>();
		
		arList.add("First");
		arList.add("Second");
		arList.add("Third");
		arList.add("Fourth");
		arList.add("Fifth");
		//arList.add(17);
		
		for(int i=0; i<arList.size();i++)  // iterate
		{
			System.out.println(arList.get(i));
		}
		
		//Using Iterator
		//we can traverse the elements only in forward direction
		//Method- hasNext()
		//			next()
		
		Iterator<String> it= arList.iterator(); 
		while(it.hasNext())
		{
			System.out.println("Using Iterator" + " " + it.next());
		}
		//Using ListIterator
		//ListIterator you can traverse the elements in both the directions – forward and backward.
		//hasnext()
		//hasPrevious()
		//nextIndex() 
		//previousIndex()
		/*ListIterator<String> it1= arList.listIterator();
		while(it1.hasNext())
		{
			System.out.println("Using ListIterator" + it1.next());
		}*/
		
		
		 ListIterator<String> it2= arList.listIterator(); 
		 while (it2.hasPrevious()) {
		 //Getting index of previous element
		 
		 System.out.println(it2.previous()); }
		 
		
		//enhaced loop
		for(String element : arList)
		{
			System.out.println(element);
		}
		
		
	}

}
