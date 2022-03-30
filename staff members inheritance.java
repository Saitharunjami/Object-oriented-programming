//3. Write a java program to implement the concept of inheritance where the subclass StaffMember inherits the superclass Department and implements the interface Publication. Print the details of the department along with their faculty details and their publication. Consider 15 faculty members are in the dept.

//CODE:
import java.util.*;
class Department{
public String departmentName;
public String HODName;
public int totalStudents;
public int no_of_sections;
public Department(String departmentName, String HODName, int totalStudents, int no_of_sections){
this.departmentName = departmentName;
this.HODName = HODName;
this.totalStudents = totalStudents;
this.no_of_sections = no_of_sections;
}
public void showDepartmentDetails(){
System.out.println("Department: " + departmentName);
System.out.println("HOD: " + HODName);
System.out.println("Students: " + totalStudents);
System.out.println("Sections: " + no_of_sections);
}
}
interface Publication{
public int journal_count =890;
public int project_count=765;
public int pattern_count=32;
public void showPublicationDetails();
}
class StaffMember extends Department implements Publication{
Scanner sc = new Scanner(System.in);
private String staffName;
private int staffId;
private String staffQualification;
private String designation;
private int experience;
StaffMember(String departmentName, String HODName, int totalStudents, int no_of_sections,String staffName, int staffId, String staffQualification, String designation, int experience){
super(departmentName,HODName,totalStudents,no_of_sections);
this.staffName = staffName;
this.staffId = staffId;
this.staffQualification = staffQualification;
this.designation = designation;
this.experience = experience;
}
public void showPublicationDetails(){
System.out.println("Journals: " + journal_count);
System.out.println("Projects: " + project_count);
System.out.println("Patterns: " + pattern_count);
}
public void showStaffDetails(){
System.out.println("Staff Name: " + staffName);
System.out.println("Staff ID: " + staffId);
System.out.println("Staff Qualification: " + staffQualification);
System.out.println("Designation: " + designation);
System.out.println("Experience: " + experience);
}
}
public class Inheritance {
public static void main(String[] args){
StaffMember s1 = new StaffMember("Math", "Dr.Raju", 30, 2, "Somu", 1620, "PhD Math", "Dr.", 7);
s1.showDepartmentDetails();
s1.showStaffDetails();
s1.showPublicationDetails();
StaffMember s2 = new StaffMember("chemistry", "Dr.Ramu", 37, 3, "Rakesh", 1423, "MSc chemistry", "Mr.", 10);
s2.showDepartmentDetails();
s2.showStaffDetails();
s2.showPublicationDetails();
StaffMember s3 = new StaffMember("Math", "Dr.Raju", 35, 3, "Abdul", 1859, "MSc Math", "Mr.", 5);
s3.showDepartmentDetails();
s3.showStaffDetails();
s3.showPublicationDetails();
StaffMember s4 = new StaffMember("Physics", "Dr.Rahul", 35, 3, "Seenu", 2852, "PhD Physics", "Dr.", 11);
s4.showDepartmentDetails();
s4.showStaffDetails();
s4.showPublicationDetails();
StaffMember s5 = new StaffMember("Math", "Dr.Raju", 35, 3, "Ravi", 8569, "BSc Math", "Mr.", 4);
s5.showDepartmentDetails();
s5.showStaffDetails();
s5.showPublicationDetails();
StaffMember s6 = new StaffMember("English", "Dr.Susmitha", 35, 3, "Jane", 5856, "PhD English", "Miss", 5);
s6.showDepartmentDetails();
s6.showStaffDetails();
s6.showPublicationDetails();
StaffMember s7 = new StaffMember("Spanish", "Dr.Arun", 35, 3, "Robert Downey", 8652, "PhD Spanish", "Dr.", 14);
s7.showDepartmentDetails();
s7.showStaffDetails();
s7.showPublicationDetails();
StaffMember s8 = new StaffMember("Math", "Dr.Raju", 35, 3, "Scarlet", 4512, "MSc Math", "Mrs.", 8);
s8.showDepartmentDetails();
s8.showStaffDetails();
s8.showPublicationDetails();
StaffMember s9 = new StaffMember("Math", "Dr.Raju", 35, 3, "Vision", 7547, "BSc Math", "Mr.", 4);
s9.showDepartmentDetails();
s9.showStaffDetails();
s9.showPublicationDetails();
StaffMember s10 = new StaffMember("Math", "Dr.Raju", 35, 3, "Job", 1234, "Diploma", "Mr.", 1);
s10.showDepartmentDetails();
s10.showStaffDetails();
s10.showPublicationDetails();
StaffMember s11 = new StaffMember("Math", "Dr.Raju", 35, 3, "Jeffy", 7154, "MSc Statistics", "Mr.", 5);
s11.showDepartmentDetails();
s11.showStaffDetails();
s11.showPublicationDetails();
StaffMember s12 = new StaffMember("Math", "Dr.Raju", 35, 3, "Hinata", 7153, "PhD Statistics", "Dr.", 5);
s12.showDepartmentDetails();
s12.showStaffDetails();
s12.showPublicationDetails();
StaffMember s13 = new StaffMember("Math", "Dr.Raju", 35, 3, "Sakura", 7454, "BSc Math", "Mrs.", 10);
s13.showDepartmentDetails();
s13.showStaffDetails();
s13.showPublicationDetails();
StaffMember s14 = new StaffMember("Math", "Dr.Raju", 35, 3, "Itachi", 1870, "PhD Math", "Dr.", 11);
s14.showDepartmentDetails();
s14.showStaffDetails();
s14.showPublicationDetails();
StaffMember s15 = new StaffMember("Math", "Dr.Raju", 35, 3, "Sasuke", 1452, "BSc Statistics", "Mr.", 2);
s15.showDepartmentDetails();
s15.showStaffDetails();
s15.showPublicationDetails();
}
}
