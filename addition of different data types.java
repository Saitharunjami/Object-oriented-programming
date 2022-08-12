//3.Create a class toper form addition of different datatypes (int,double,string) using the concept of polymorphism. int add(int,int) add(int, double) add(double,int) add(double,double) add(String,String) add(int[])//
//CODE:
class Add
{
public int add(int a,int b)
{
return a+b;
}
public double add(int a,double b)
{
return a+b;
}
public double add(double a,int b)
{
return a+b;
}
public double add(double a,double b)
{
return a+b;
}
public void add(String str1,String str2)
{
String s=str1+str2;
System.out.println("method 5:concatinated string ="+s);
}
public void add(int[] nums)
{
int sum=0;
int n=6;
for(int i=0;i<n;i++)
{
sum+=nums[i];
}
System.out.println("method 6:sum:"+sum);
}
public static class addition {
public static void main(String args[])
{
Add sc=new Add();
System.out.println("method 1:sum:"+sc.add(5,3));
System.out.println("method 2:sum:"+sc.add(2,7.8));
System.out.println("method 3:sum:"+sc.add(2.6,3));
System.out.println("method 4:sum:"+sc.add(2,9.7));
sc.add("tha","run");
int b[]= {10,2,35,40,50,6};
sc.add(b);
}
}
}
