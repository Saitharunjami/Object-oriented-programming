//2.Write  a  java  program  to  implement  the  concept  of  single  inheritance  and  print the student details with class name ‘Student’.

//CODE:

import java.util.Scanner;
class StudentInfo {
    int RegNo;
    String StuName;
    String Branch;
    String Mailid;
    String Gender;
    void input() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Registration Number: ");
        RegNo = sc.nextInt();  
        sc.nextLine(); 
        System.out.print("Name: ");
        StuName = sc.nextLine();
        System.out.print("Branch: ");
        Branch = sc.nextLine();
        System.out.print("Mailid: ");
        Mailid = sc.nextLine();
        System.out.print("Gender: ");
        Gender = sc.nextLine();
        
        
    }
}
class Student extends StudentInfo {
    void display() {
        System.out.println("Student Registration Number is: "+RegNo);
        System.out.println("Student Name is: "+StuName);
        System.out.println("Student Branch is: "+Branch);
        System.out.println("Student Mailid is "+Mailid);
        System.out.println("Student Gender is  "+Gender);
        
    }
    public static void main(String args[]) {
        Student obj = new Student();
        obj.input();
        obj.display();
    }
}
