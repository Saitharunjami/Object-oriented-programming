/*2. Create a class “A” with two methods, “arms” to check whether a given number is 
Armstrong number (sum of cube of individual digit is the same as the number) or not and 
“multarray” ( multiply two consecutive array elements and for the last number again multiply with first number and print the value). Create 3 threads to perform the following operation simultaneously 
 
1. multiply two consecutive array elements and print it. Eg. Input:(1 2 3 4 5) output: (2 6 12 
20 5) 
 
2. check whether the given number 153 is Armstrong number or not. 3.check whether the given number 120 is Armstrong number or not */
 
 
 
public class Main{ 
 
public static void main(String[] args){ 
Thread t1 = new Thread(new Thread1()); 
t1.start(); 
Thread t2=new Thread(new Thread2()); 
t2.start(); 
Thread t3=new Thread(new Thread3()); 
t3.start(); 
} 
 
} 
 
class A{ 
 
public void arms(int n) { int c=0,a,temp; temp=n; 
while(n>0) 
 { 
a=n%10; n=n/10; c=c+(a*a*a); 
} 
 
System.out.println(); if(temp==c) 
System.out.println(temp+" is armstrong number"); else 
System.out.println(temp+" is not an armstrong number"); 
 
} 
public void multarray(int arr[]) { int n = arr.length; 
int prod = 1; 
 for (int i = 0; i < n; i++) 
 
{ 
 
if(i==n-1) { 
 
prod = arr[0]*arr[n-1]; 
 
} 
 
else { prod=arr[i]*arr[i+1]; 
} 
 
System.out.print(" " + prod); 
 } 
 
} 
 
} 
 
class Thread1 extends A implements Runnable{ 
int a[]= {1,2,3,4,5}; public void run() { multarray(a); 
} 
 
} 
 
class Thread2 extends A implements Runnable{ int n=153; public void run() { 
arms(n); 
 
} 
 } 
 
class Thread3 extends A implements Runnable{ int n1=120; public void run() { arms(n1); 
} 
 
} 
