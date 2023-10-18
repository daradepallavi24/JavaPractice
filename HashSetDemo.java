package packagecom.collectiondemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Integer> numbers=new HashSet<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(4);
		numbers.add(4);// not accepting duplicate valeue
		System.out.println(numbers);
		
		HashSet<Integer> primeNumber=new HashSet<Integer>();
		primeNumber.add(2);
		primeNumber.add(3);
		System.out.println(primeNumber);
		
		//to check primenumber is subset of number
		boolean check=numbers.containsAll(primeNumber);
		System.out.println("is primenumber is subset of number " + check);
		
		HashSet<String> str=new HashSet<String>();
		str.add("Pallavi");
		str.add("Divyani");
		str.add("Satyam");
		str.add("Swapnil");//no duplicate
		str.add(null); //only 1 null value is allowed
		str.add(null);
		str.add(null);
		str.add(null);
		// it is not maintating insertion order
		System.out.println(str);
		
	}

}