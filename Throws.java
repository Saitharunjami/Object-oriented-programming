//1.Write a java program to demonstrate ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException and NumberFormatException using throws.
//CODE:
import java.util.Scanner;
import java.util.*;
public class Exception
{ public void divide() throws ArithmeticException
{ int x=200,y=0;
System.out.println(x/y);
}
public char Null() throws NullPointerException
{ String s=null;
return s.charAt(0);
}
public void array() throws ArrayIndexOutOfBoundsException
{ int c[]=new int[5];
c[7]=4;
System.out.println(c);
}
public void intparsingMethod() throws NumberFormatException
{
int b=Integer.parseInt("sreeya");
System.out.println(b);
}
public static void main(String args[])
{ Exception obj=new Exception();
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1 for airthmetic exception"+ ",2 for nullpointer"+ " ,3 forarrayindexoutofbounds "+ " and 4 for numberformat exception");
int a=sc.nextInt();
if(a==1)
{ obj.divide();
}
else if(a==2)
{ obj.Null();
}
else if(a==3)
{ obj.array();
}
else if(a==4)
{
obj.intparsingMethod();
}
}
}
