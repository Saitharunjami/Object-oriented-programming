//1.Write a java code that implements the concept of inheritance. Import the package and calculate volume of a box and display it.

import java.util.*; 
public class Vol{
public static void main(String[] args){ 
    Scanner in= new Scanner(System.in); 
    System.out.println("Enter the dimensions(length,breadth,height): "); 
    Box obj= new Box();
obj.setBox(in.nextInt(),in.nextInt(),in.nextInt()); 
System.out.println("Volume is :"+ obj.Volume()); 
in.close();
}
}
class Rectangle{ private int length; private int breadth;
public void Rectangle(int length, int breadth){ 
    this.length=length;
    this.breadth=breadth;
}
public int area(){
return length*breadth;
}
}
class Box extends Rectangle{ private int height;
public void setBox(int length, int breadth, int height){ 
    Rectangle(length,breadth);
this.height=height;
}
public int Volume(){ 
    return area()*height;
}
}
