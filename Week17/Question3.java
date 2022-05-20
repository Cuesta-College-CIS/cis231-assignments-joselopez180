/*
    Program Name: Question3.java
    Author: Jose Antonio Lopez
    Date: 05/19/2022
    Program Description (brief): 
        This code will out-print student information
    including: name, student Id, date of birth, 
    courses name, course Id, score, grade, and 
    total credits. This code inherits and uses
    abrstract to organize the code into parts.

*/


import java.util.ArrayList;
import java.io.FileNotFoundException;


interface CourseActivity {

    void decideGrade();

    void printCourseinfo();
}

class Course implements CourseActivity {

    String Cid;
    String Coursename;
    int Score;
    String Grade;
        
    public Course(String cid, String coursename, int score) {
        Cid = cid;
        Coursename = coursename;
        Score = score;
        decideGrade();
    }
    
    
    public void decideGrade() {
        if(Score > 89){
            Grade = "A";
        }

        else if(Score > 79){
            Grade = "B";
        }

        else if (Score > 69){
            Grade = "C";
        }

        else if (Score > 59){
            Grade = "D";
        }

        else{
            Grade = "F";
        }   
    }
    
    
    public void printCourseinfo() {
        System.out.print(toString());     
    }
    
    public String toString() {
        return "Course ID\t\t" + Cid + "\tName: " + Coursename + "\t\tScore: " + Score + "\t\tGrade " + Grade;
    }     
}


abstract class Person {

    String Name;
    String Dob;
    
    public Person(String name, String dOB) {
        Name = name;
        Dob = dOB;
    }

    abstract void PrintPerson();

    public String toString() {
        return "Name: " + Name + "\t \tDOB: " + Dob;
    }
}

class Student extends Person {

    int Sid;
    int Credit;
    ArrayList<Course> Clist;
    
    
    public Student(String name, String dOB, int sid, int credit, ArrayList<Course> clist) {
        super(name, dOB);
        Sid = sid;
        Credit = credit;
        Clist = clist;
    }

    void PrintPerson() {
        System.out.println("Name: \t" + Name + "ID\t" + Sid + "DOB\t" + Dob);
    }

    public String toString() {

        String str = super.toString();

        str += "\nID:   " + Sid + "\t\tCredits: \t" + Credit + "\n";

        for (int i = 0; i < Clist.size(); i++) 
            str += Clist.get(i).toString()+"\n";            
        
        return str;
    }
    
}

public class Question3 {

    public static ArrayList<Student> fillupStudent() throws FileNotFoundException {
    
        ArrayList<Student> thisSlist = new ArrayList<Student>();

        ArrayList<Course> JohnCourses = new ArrayList<>();
        JohnCourses.add(new Course("CIS01", "C++", 90));
        JohnCourses.add(new Course("CIS02", "Python", 80));
        JohnCourses.add(new Course("CIS03", "Java", 90));
        thisSlist.add(new Student("John", "03/01/2002", 1001, 9,JohnCourses ));
    
        ArrayList<Course> KurtCourses = new ArrayList<>();
        KurtCourses.add(new Course("CIS01", "C++", 100));
        KurtCourses.add(new Course("CIS02", "Python", 100));
        KurtCourses.add(new Course("CIS232", "Java2", 90));
        KurtCourses.add(new Course("CNT02", "Cisco", 80));
        thisSlist.add(new Student("Kurt", "05/01/2002", 1002, 12, KurtCourses));
        
        ArrayList<Course> KimCourses = new ArrayList<>();
        KimCourses.add(new Course("CIS01", "C++", 100));
        KimCourses.add(new Course("CIS232", "Java2", 90));
        thisSlist.add(new Student("Kim", "01/01/1990", 1003, 6, KimCourses));

        return thisSlist; 
    }
        
    public static void printStudent(ArrayList<Student> slist) {
        
        for (int i = 0; i<slist.size(); ++i)
            System.out.println(slist.get(i));
         
    }
         
    public static void main(String[] args) throws FileNotFoundException {
        
        ArrayList<Student> slist;
        
        slist = fillupStudent();
        
        printStudent(slist);
    }
}
