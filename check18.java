//3.Write a program to get the details of voter and check whether age is >18 if not, raise an exception “check18”. Create your exception in the name “check18”.
//CODE:
import java.util.Scanner;
public class voting
{ void check18(int age)
{ if(age<18)
throw new ArithmeticException("Not Eligible for voting");
else
System.out.println("Eligible for voting");
}
public static void main(String args[]){
voting obj = new voting();
Scanner sc=new Scanner(System.in);
System.out.println("enter age");
int a=sc.nextInt();
try{
obj.check18(a);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}
