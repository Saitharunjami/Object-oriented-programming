//2.Write a java generic program to print greatest of two numbers.
//CODE:
class Max{
public static <T extends Comparable<T>> T maximum(T x, T y)
{
T max = x;
if(y.compareTo(max)>0)
{
max = y;
}
return max;
}
public static void main(String args[])
{
System.out.println("maximun number is "+maximum(10,11));
}
}
