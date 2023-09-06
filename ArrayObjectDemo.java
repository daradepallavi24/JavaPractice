package com.java.demo.intro;
class UserDefinedType {
    int i;

    public void method1() {
        System.out.println("from user-defined type of object");
    }
}

public class ArrayObjectDemo {

    public static void main(String[] args) {
        int[] a;
        int a1[];
        UserDefinedType[] userDefineArray = new UserDefinedType[10]; // array type of object

        // userDefineArray[0] = object1;
        // userDefineArray[1] = object2;
        // userDefineArray[2] = object3;
        // userDefineArray[3] = object4;
        // userDefineArray[4] = object5;
        // userDefineArray[5] = object6;

        for (int i = 0; i < userDefineArray.length; i++) {
            userDefineArray[i] = new UserDefinedType();
        }
        userDefineArray[1].method1();
    }


    int m[] = {3, 5, 7, 2, 7, 9};

    int z[] = m;

    for (int i = 0; i < z.length; i++) {
        System.out.println(z[i]);
    }

    k[2] = 43; 
    System.out.println(z[2]);

    k[4] = 59;
    System.out.println(z[4]);
}
}


//array object
/*class UserDefinedType
{
int i;
	
	public void method1()
	{
		System.out.println("from user defined type of object");
	}
}


public class ArrayObjectDemo {

	
	public static void main(String[] args) {
		int[] a;
		int a1[];
		//UserDefinedType object=new UserDefinedType();// simple object 
		UserDefinedType[] userDefineArray=new UserDefinedType[10]; // array type of object
	
		
		for(int i=0; i< userDefineArray.length; i++ )
		{
		userDefineArray[i]=new UserDefinedType();
		}
		userDefineArray[1].method1();
	}
*/

//using clone() method
		/*int a[]= {3,5,7,2,7,9};
		
		 int b[]=a.clone();
		 
		 for(int i = 0; i<a.length;i++) 
		 {
			 System.out.println(b[i]);
		 }
					
		 a[2]=43;
		 System.out.println(b[2]);
		 
		 a[3]=53;
		 System.out.println(b[3]);*/



/*int a[]= {3,5,7,2,7,9};

int b[]=Arrays.copyOf(a,a.length);

for(int i = 0; i<a.length;i++) 
{
	 System.out.println(b[i]);
}
			
a[2]=43;
System.out.println(b[2]);

a[3]=53;
System.out.println(b[3]);*/


/*int a[]= {3,5,7,2,7,9};

int b[]=new int[a.length];


for(int i = 0; i<a.length;i++)
{
	b[i]=a[i];
}

System.out.println(a[2]);
a[2]=43; // changing the value 
System.out.println(a[2]);
System.out.println(b[2]);

a[4]=59;
System.out.println(b[4]);*/

