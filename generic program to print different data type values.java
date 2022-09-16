
//1.Write a java generic program to create class that takes one type parameter to print the different data type value and its class name.
//CODE:
import java.util.*;
class Test<T>
{
T obj;
Test(T obj)
{
this.obj=obj;
}
public T getObject()
{
return this.obj;
}
public void print()
{
System.out.println(obj.getClass().getName());
}
}
public class gen01 {
public static void main(String[] args)
{
Test <Integer> Obj1=new Test<Integer>(15);
System.out.println(Obj1.getObject());
Obj1.print();
Test <String> Obj2=new Test<String>("JAVA");
System.out.println(Obj2.getObject());
Obj2.print();
Test <Double> Obj3=new Test<Double>(19.6);
System.out.println(Obj3.getObject());
Obj3.print();
}
}
