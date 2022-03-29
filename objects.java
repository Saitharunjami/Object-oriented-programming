// Write a Java program to create a class and create 5 objects using array of objects. Read the input from the user, calculate percentage of marks and display the student details.
// Code:
import java.util.Scanner; 
public class Main
{

static Scanner z=new Scanner(System.in); 
static String name, Reg, dept, address; 
static int m[] = new int[5];
static int year;
static float total=0, avg;
public static void main(String[] args)
{

Student[] ob = new Student[5];

for (int i=0; i<5;i++){
ob[0] = new Student(); 
ob[0].getdetail(); 
System.out.println(); 
System.out.println("Student " + (i+1));
// System.out.println("Student 1"); 
ob[0].display(); 
System.out.println();
}
}

public static class Student{
 
public void getdetail(){ 
    System.out.println("Enter Name "); 
    name = z.nextLine();
System.out.println("Enter Registration No. "); 
Reg = z.nextLine();
System.out.println("Enter department "); 
dept = z.nextLine(); 
System.out.println("Enter address "); 
address = z.nextLine(); 
System.out.println("Enter year");
year = z.nextInt();
System.out.println("Enter your Makrs for 5 subjects"); 
for (int i=0; i<5;i++)
{

m[i] = z.nextInt(); 
total = total+m[i];
}

avg= total/5;
}

public void display(){ 
System.out.println("Name " + name);
System.out.println("Registration No. " + Reg); 
System.out.println("Department " + dept); 
System.out.println("Address " + address); 
System.out.println("Year " + year); 
System.out.println("Marks ");
for (int i=0; i<5;i++){ 
    System.out.print(m[i] + ", ");
}
 
System.out.println("\nPrecentage " + avg);
}
}
}
