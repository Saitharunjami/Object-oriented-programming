/*2) Create a class “Student” which is the super class for the class “Mark”. Read the details of a students and calculate the entrance mark to raise a user defined exception using “Throws”
Class : Student Variables: Name(String) Regno (int)
Course (String)
Method: getdetails() (* either read the input or store it directly) Class: Mark
Variables:
Part1(int) (max 50) Part2(int) (max 50)
Core(int) (max 100)
Total (int)(Part1+Part2+Core)
Method: getmarks() (* either read the input or store it directly) CalcEntranceMark:
• If the total is <100 raise a “NotEligibleException” and print “NOT ELIGIBLE”
• If the total is >=100 and <150 raise a “WaitingListException” and print “WAITING LIST”
• If the total is >=150 and print “ELIGIBLE” */

//CODE:

import java.util.Scanner;
class NotEligibleException extends Exception
{
NotEligibleException(String s)
{
super(s);
}
}
class WaitingListException extends Exception
{
WaitingListException(String s)
{
super(s);
}
}
class Student3{
String name="Sreeya";
String course="CSE";
int regno=197338;
void getdetails()
{
System.out.println("Name of student is "+name);
System.out.println("Registration no of student is "+regno);
System.out.println("Course of student "+course);
}
}
public class Mark {
void getmarks()
{
int Part1,Part2,Core;
}
void CalcEntranceMark( int Part1,int Part2,int Core) throws
NotEligibleException,WaitingListException
{
int Total=Part1+Part2+Core;
System.out.println(Total);
if(Total<100)
{
throw new NotEligibleException("NOT ELIGIBLE");
}
else if(Total>=100 && Total<150)
{
throw new WaitingListException("WAITING LIST");
}
else {
System.out.println("ELIGIBLE");
}
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter Marks :");
int Part1=in.nextInt();
int Part2=in.nextInt();
int Core=in.nextInt();
Student3 s=new Student3();
s.getdetails();
Mark obj=new Mark();
try {
obj.CalcEntranceMark(Part1,Part2,Core);
}
catch(NotEligibleException e){
System.out.println(e);
}
catch(WaitingListException e){
System.out.println(e);
}
}
}
