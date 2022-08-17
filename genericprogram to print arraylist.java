//3.Write a java generic program to print the ArrayList of different data types.
//CODE:
import java.util.*;
class JavaExample{
public static void main(String args[]){
ArrayList<String> alist=new ArrayList<String>();
alist.add("Sai");
alist.add("Sreeya");
alist.add("Tharun");
alist.add("Vijay");
alist.add("Rohit");
alist.add("Narayana");
System.out.println("elements in ArrayList of string:"+alist);
ArrayList<Integer>numbers=new ArrayList<Integer>();
numbers.add(11);
numbers.add(7);
numbers.add(56);
numbers.add(16);
System.out.println("elements in ArrayList of integers:"+numbers);
ArrayList<Double>d=new ArrayList<Double>();
d.add(5.7);
d.add(34.8);
d.add(25.8);
d.add(7.9);
System.out.println("elements in ArrayList of double"+d);
ArrayList<Float>f=new ArrayList<Float>();
f.add(5.3f);
f.add(6.7f);
f.add(9.1f);
f.add(55.9f);
System.out.println("elements in ArrayList of float"+f);
}
}
