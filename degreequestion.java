//1) Create a class 'Degree' having a method 'getDegree' that prints "I got a degree". It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that prints "I am an Undergraduate" and "I am a Postgraduate"respectively. Call the method by creating an object of each class and print the studentdetails(name,regno,degree,years)bycreatingamethod“display” in class Degree
//CODE:



import java.util.*;
class UnderGraduate extends Degree
{
public void GetDegree()
{
System.out.println("I am an UnderGraduate");
}
}
class PostGraduate extends Degree
{
public void GetDegree()
{
System.out.println("I am PostGraduate");
}
}
public class Degree
{
String D;
public void GetDegree()
{
System.out.println("I got Degree");
}
public void display(String name,String reg,int yrs)
{
System.out.println("Name of student is "+name);
System.out.println("Registration number of student is "+reg);
System.out.println("Year of student is "+yrs);
}
public static void main(String args[])
{
String name;
String reg;
int yrs;
String D;
Scanner sc=new Scanner(System.in);
System.out.println("Enter name");
name=sc.nextLine();
System.out.println("Enter reg no");
reg=sc.next();
System.out.println("Enter years");
yrs=sc.nextInt();
System.out.println("Enter degree");
D=sc.next();
Degree obj=new Degree();
obj.GetDegree();
obj.display(name,reg,yrs);
if(D.equals("UnderGraduate"))
{
}
else
{
}
UnderGraduate obj1=new UnderGraduate();
obj1.GetDegree();
PostGraduate obj2=new PostGraduate();
obj2.GetDegree();
}
}
