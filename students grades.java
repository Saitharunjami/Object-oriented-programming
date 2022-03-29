// write a Java Program to calculate and display Student Grades. This program calculates the grade of a student based on the marks entered by user in each subject. Program prints the grade based on this logic. If the average of marks is >= 80 then prints Grade ‘A’ If the average is <80 and >=60 then prints Grade ‘B’ If the average is <60 and >=40 then prints Grade ‘C’ else prints Grade ‘D’

// CODE:

import java.util.Scanner;
public class Studentgrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();
        double marks[] = new double[subjects];
        int i;
        double avg;
        double total = 0; // Initializing total marks to be zero
       
        System.out.println("Marks entered must be in range 0 to 100");
   
        for (i=0; i<subjects; i++) {
            System.out.print("Enter subject "+(i+1)+" marks here : ");
            marks[i] = sc.nextInt();
            total = total+marks[i];
        }

        System.out.println("Total marks obtained by the student: "+total);
        avg = total/subjects;
        System.out.println("Average marks obtained by the student: "+avg);
    System.out.print("Grade obtained by Student: ");
        if(avg<=100 & avg>=80) {
            System.out.print("A");
        }
        else if (avg<80 & avg>=60) {
            System.out.print("B");
        }
        else if (avg<60 & avg>=40) {
            System.out.print("C");
        }
        else if (avg<40 & avg>=0) {
            System.out.print("D");
        }
        else if (avg>100) {
            System.out.print("Marks entered must be less than or equal to 100");
        }
        else {
            System.out.print("Invalid Input");
        }
    }
}


