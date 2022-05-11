/*3. Create a class with method to count odd and even number in 3X3 matrix. Create two threads to perform the operation concurrently. Display the odd and even number count in the matrix. (use Runnable interface) 
 
Original array: 
4 1 3 
3 5 7 
8 2 6 
 
Frequency of odd numbers: 5 Frequency of even numbers: 4 */


class Frequency{ static final int MAX = 100; 
static void freq(int ar[][], int k, int l) { 
int even = 0, odd = 0; for (int i = 0; i < k; ++i) 
{ 
for (int j = 0; j < l; ++j) 
{ 
if ((ar[i][j] % 2) == 0) 
++even; else ++odd; 
} 
} 
System.out.print(" Frequency of odd number =" + odd + " \n"); 
System.out.print(" Frequency of even number = " + 
even + " \n"); 
} 
public static void main(String[] args) { int m = 3, n = 3; 
int array[][] = {{4,1,3}, {3,5,7}, {8,2,6}}; 
freq(array, m, n); 
} 
}public class Main 
{ 
public static void main(String[] args) { 
Thread t1 = new Thread(new Thread1()); 
t1.start(); 
Thread t2=new Thread(new Thread2()); 
t2.start(); 
} 
} 
class Thread1 implements Runnable 
{ 
public void run() 
{ 
int m = 3, n = 3; int arr[][] = {{4,1,3}, {3,5,7}, {8,2,6}}; int even = 0; for (int i = 0; i < m; i++) 
{ 
for (int j = 0; j < n; j++) 
{ 
if ((arr[i][j] % 2) == 0) even++; 
} 
} 
System.out.print(" Frequency of even number = " +even + " \n"); 
} 
} 
class Thread2 implements Runnable 
{ 
public void run() 
{ 
int m = 3, n = 3; 
int arr[][] = {{4,1,3}, {3,5,7}, {8,2,6}}; 
int odd = 0; for (int i = 0; i < m; i++) 
{ 
for (int j = 0; j < n; j++) 
{ 
if ((arr[i][j] % 2)!=0) 
odd++; 
} 
} 
System.out.print(" Frequency of odd number = " +odd + " \n"); 
} 
} 
