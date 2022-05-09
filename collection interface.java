/*1)Using Java Collection Interface, write a Java program that implements the List interface:  
a.  Create a list using ArrayList Class - Add elements to the list – Access elements from the list – Remove an element from the list. 
b.Create a list using LinkedList Class - Add elements to the list – Access elements from the list – Remove an element from the list. 
*/

//A)
//CODE:


import java.util.ArrayList;
import java.util.List;
public class Array1 {
	public static void main(String[] args)
	{
		List<Integer> al = new ArrayList<>();
      //adding elements
		al.add(6);
		al.add(89);
		al.add(66);
		al.add(8);
		al.add(76);
		System.out.println(al);
          //removing 
         //REMOVES 89(first element)
		al.remove(1);
          //REMOVES 66(first element in the updated list)
		al.remove(1);
        //removes 0th element i.e 6
                   al.remove(0);
        // Print the updated ArrayList
		System.out.println(al);
	}
}


//B)
//CODE:
import java.util.*;
public class Linklist {
	public static void main(String args[])
	{
		// class linked list
		LinkedList<String> ll = new LinkedList<String>();

		// Adding elements to the linked list
		ll.add("T");
		ll.add("H");
		ll.addLast("A");
		ll.addFirst("R");
		ll.add(2, "U");

		System.out.println(ll);

		ll.remove("H");
		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
	}
}
