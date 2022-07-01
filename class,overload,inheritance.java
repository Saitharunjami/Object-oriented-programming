//1)Write a Java Program to define a class, describe its constructor, overload the Constructors  and instantiate its object.
//Code:


public class Students {
    String name;
    String department;
    String address;
    int yearofpass,studentid;

// null constructor
Students() {
    name="Tharun";
    studentid = 7034;
    yearofpass = 2025;
    department = "CSE";
    address = "Vijayawada";
}

// parameterized constructor
Students(String n,int stuid,int pass,String cse,String b) {
    name=n;
    studentid=stuid;
    yearofpass=pass;
    department=cse;
    address=b;
}

// Copy constructor
Students(Students s) {
    name=s.name;
    studentid=s.studentid;
    yearofpass=s.yearofpass;
    department=s.department;
    address=s.address;
}

void display() {
    System.out.println(name+"\t\t"+studentid+"\t        "+yearofpass+"\t\t"+department+"\t\t    "+address);
}
}

class studentdemo {
    public static void main(String arg[]) {
        System.out.println("\n");
        System.out.println("Name"+"\t\t"+"StudentID"+"\t"+"YearOfPass"+"\t"+"Department"+"\t    "+"Address");
        Students s1=new Students();
        Students s2=new Students("Habeeb",7005,2024,"CSE","Hyderabad");
        Students s3=new Students(s1);
        s1.display();
        s2.display();
        s3.display();
    }
}
