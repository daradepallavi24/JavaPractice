package packagecom.collectiondemo;


import java.util.LinkedList;
import java.util.List;

//LinkedList is a data structure where each element consist of three things  node - previous add-3-next add
//First one is the reference to previous element, 
//second one is the actual value of the element and last one is the reference to next element.
//The LinkedList class in Java is an implementation of doubly linked list which can be used both as a List as well as Queue.
//LinkedList in java can have any type of elements including null and duplicates
//Elements can be inserted and can be removed from both the ends and can be retrieved from any arbitrary position.

/*LinkedList implements List,Queue,Serelizable, clonable extends AbstractSequentialList
{
	
}
 add()
 addAll()
 remove()
 set()
 get()
 
 addFirst()
 addlast()
 getFirst()
 getLast()
 removefirst()
 removelast()
 peek() // return head element return
 poll() // remove first element from list
 */
public class LinkListDemo {

	public static void main(String[] args) {
		
		List linkedList=new LinkedList();
		linkedList.add("First");
		linkedList.add("Second");
		linkedList.add("Third");  // accepting the duplicate values
		linkedList.add("Third");
		linkedList.add("Third");
		linkedList.add(null);     // allow a multiple null entries
		linkedList.add(null);
		linkedList.add(null);
		//linkedList.add(3);
		//linkedList.add('A');
		//linkedList.add(2.3f);
		//linkedList.add(true);
		
		linkedList.add(1, "Forth");
		linkedList.set(1, "Fifth");// override
		linkedList.remove(1);
		
	String str=(String) linkedList.get(1);
		
		System.out.println(linkedList);
		
		// traverse a data using for loop, enhanced for loop, listIterator, iterator
		
		
		
	}

} 
