// Using constructor initialize with default value for radius. Calculate area and Circumference of a circle and print it. For parameterized constructor read the value from the user.
// CODE:


import java.util.Scanner;
public class Circle{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle: ");
    double radius = sc.nextDouble();
    circle o = new circle(radius);
    System.out.println("The area of Circle for given radius(r): "+o.Area());
    System.out.println("The circumference of the circle for given radius(r):"+o.circumference());
    }
}
class circle{double radius;
final double pi = 3.14;
circle(double radius){
    this.radius = radius;

}public double circumference(){
    return (2*pi*this.radius);
    
}public double Area(){
    return (pi*(this.radius)*(this.radius));
    
    }
    
}
