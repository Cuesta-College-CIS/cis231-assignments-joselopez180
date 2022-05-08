/*
    Program Name: Quiz4.java
    Author: Jose Antonio Lopez
    Date: 05/8/2022
    Program Description (brief): 
        This code will intake student and course
    information when prompt to enter. Once the user 
    has completed their input, the code will find
    the student who is taking the most credit hours 
    incomparison to the other students from 
    user input.
*/


import java.util.ArrayList;
import java.util.Scanner;

class Student{
    Integer sid;
    String sname;
    ArrayList<Course> clist;

    Student(Integer id, String name, ArrayList<Course> c) {
        sid = id;
        sname = name;
        clist = c;
    }

    public String toString() {
        //Returns string type to be outputed.
        String studentString = ("Student: " + sid + "  " + sname);
        return studentString;
    }

    public Integer getTotalCredits() {
        //This calculates the total credits and returns it.
        Integer totalCredits = 0;
       
        for (int i = 0; i < clist.size(); ++i)
            totalCredits += clist.get(i).credit;
    
        return totalCredits;
    }
}

class Course{
    String cid;
    String cname;
    Integer credit;
    String grade;

    Course(String id, String name, Integer c, String g){
        cid = id;
        cname = name;
        credit = c;
        grade = g;
    }

    public String toString() {
        //Returns course information in String formate to be outputed.
        String courseString = ("   Course: " + cid.toString() + "  " + cname.toString() + "  " + credit.toString() + "  " + grade.toString());
        
        return courseString;
    }
}


public class Quiz4 {
    public static ArrayList<Student> fillupStudent() {
        Scanner scnr = new Scanner(System.in);
        
        int numCourses;
        int numStudents;
        String cID;
        String cName;
        Integer cCredit;
        String cGrade;
        Integer sID;
        String sName;
 
        System.out.println("Enter the number of students:");
        numStudents = scnr.nextInt();
    
        ArrayList<Student> studentInfo = new ArrayList<Student>();
    
        for(int i=0; i<numStudents; ++i){
            
            //Prompt the user to enter the name of the student.
            System.out.println("Enter student " + (i+1) + "'s name: ");
            sName = scnr.next();

            //Prompt the user to enter the students ID number.
            System.out.println("Enter student " + (i+1) + "'s ID number: ");
            sID = scnr.nextInt();

            //Prompt the user to enter the students amount of courses.
            System.out.println("Enter the amount of courses student " + (i+1) + " has taken: ");
            numCourses = scnr.nextInt();
    
            //New array list for the course information of each student.
            ArrayList<Course> stuCourses = new ArrayList<Course>();

            //For loop made to prompt the user to enter the students course information.
            for(int j = 0; j < numCourses; ++j){

                System.out.println("Enter course " + (j+1) + "'s ID: ");
                cID = scnr.next();
                
                System.out.println("Enter the course name: ");
                cName = scnr.next();
                
                System.out.println("Enter course credits: ");
                cCredit = scnr.nextInt();

                System.out.println("Enter the students grade: ");
                cGrade = scnr.next();

                Course enteredCourse = new Course(cID, cName, cCredit, cGrade);
                stuCourses.add(enteredCourse);

            }

            //New array list of sutdent information with the course information array with it.
            Student student = new Student(sID, sName, stuCourses);

            //add all the informaion of each student to the specicfic array list, "studentInfo"  in each element.
            studentInfo.add(student);

        }
 
       return studentInfo;
    }
 
    // Out prints the greastest amount of credits from the student.
    public static void printStudent(ArrayList<Student> slist) {
 
        for (int i = 0; i < slist.size(); ++i) {
            System.out.println(slist.get(i).toString());

            for (int j = 0; j < slist.get(i).clist.size(); ++j)
            System.out.println(slist.get(i).clist.get(j).toString());
            
            System.out.println();
            System.out.println("Total credits: " + slist.get(i).getTotalCredits());
            System.out.println();
        }
        
    }
 
    //Out prints the student with with the greastest amount of credits.
    public static void printStudent(ArrayList<Student> slist, Integer id){
         System.out.println("The student with the heighest amount of credits is:");
         System.out.println(slist.get(id).toString());

         for (int j = 0; j < slist.get(id).clist.size(); ++j)
            System.out.println(slist.get(id).clist.get(j).toString());
        
         System.out.println();
         System.out.println("Total credits: " + slist.get(id).getTotalCredits());
         System.out.println();
    }
 
    //Find the student with the most credits.
    public static Integer findStudent(ArrayList<Student> slist) {
        int maxCr = 0;
        int maxId = 0;
        int tot = 0;
        for (int i = 0; i < slist.size(); ++i) {
            tot = slist.get(i).getTotalCredits();
            if ( tot > maxCr) {
                maxId = i;
                maxCr = tot;
             } 

         }

        return maxId;
    }
 
    public static void main(String[] args) {
        Integer sid;
        ArrayList<Student> slist = new ArrayList<Student>();
 
        //This will prompt the user to enter each student and their courses.
        slist = fillupStudent();

        //Outputs the the students and their courses.
        printStudent(slist);

        //Finds student with greatest number of credits.
        sid = findStudent(slist); 

        //Prints the stdenst with the greatest number of credits.
        printStudent(slist, sid);
    }
 
 }