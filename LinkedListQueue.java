package packagecom.collectiondemo;
/*Differnec btn array list and link list

1. ArrayList index based data structure     Linklist is stroing the data in a node 
2. Insertion and deletion in the middle     Insertion deletion from any postion inlinked list are faster
	of array list is very slow, after   	than array list
	insertion deletion elememt need to be
	shifted	

3. Retrival of elements in arreyList is     Retrival is slow than arrya list
	faster than linke list, because its 
	index based
4 arrya list can not used stack and queue   Linklist once defined can be used as ArrayList, stack, Queue,, sindlylinked list, doubleyLinkedList

5. when to array list
if applin does more retrival than modification	if application does more modification than retrival.
*/
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

	public static void main(String[] args) {
		Queue<String> qList=new LinkedList<String>();
		// adding the element
		qList.add("java");
		qList.add("Python");
		qList.add("java Script");
		
		//accessing first element from a list
		String str=(String) qList.peek();
		System.out.println(str);
		//accessing and remove first element from a list
		String str2=(String) qList.poll();
		System.out.println(str2);
		
		// add the element at end
		qList.offer("HTML");
		System.out.println(qList);
		
		Deque<String> dList=new LinkedList<String>();
		// adding data at begnning
		dList.add("java");
		dList.add("Python");
		dList.add("java Script");
		
		dList.addFirst("C");
		
		dList.addLast("Angular");
		
		dList.removeFirst();
		
		dList.removeLast();
		
		
		
		
		
	}

}