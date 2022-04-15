//3) Define a new exception, called ExceptionLineTooLong, that prints out the error message "The string is too long". Write a program that reads all user entered string message and throws an exception of type ExceptionLineTooLong in the case where a string is longer than 80 characters. Handle also all exceptions that could be thrown by the program.
//CODE:

import java.util.*;
class ExceptionLineTooLong extends Exception{
ExceptionLineTooLong(String s)
{
super(s);
}
}
public class lineexception {
static void Lineexception(String n) throws ExceptionLineTooLong
{
if(n.length()>80)
{
throw new ExceptionLineTooLong("The strings is too long");
}
System.out.println();
}
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter message :");
String str=in.nextLine();
System.out.println(str.length());
try {
Lineexception(str);
}
catch(ExceptionLineTooLong e)
{
System.out.println(e);
}
}
}
