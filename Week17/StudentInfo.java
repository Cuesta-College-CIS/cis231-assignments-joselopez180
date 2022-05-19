
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.*;


interface CourseActivity {
	void decideGrade();
		// Based on the scores, 
		// determine the letter grade ‘A’, ‘B’, and so on.
		// There is no strict rule to implement
	void printCourseinfo();
		// Print the brief Course information
		// Any code segment is fine to print information.
}

class Course implements CourseActivity {

	// Class Properties

	// Member Methods

	// Implement the inherited methods from the interface


}

abstract class Person {
	// Member Variables
	// Constructor, and Member methods if needed
	// Abstract Method PrintPerson() ;
}


class Student extends Person {

	// Member Variables
	// Constructor, and Member methods if needed
	// Implement the inherited abstract method
		// print the brief information for the student
		// no particular requirement to implement this inherited method
}



public class StudentInfo {
	public static ArrayList<Student> fillupStudent() throws FileNotFoundException {

		ArrayList<Student> slist = new ArrayList<Student>();
		// Your code

		return slist;
	}

	public static void printStudent(ArrayList<Student> slist) {
		for (int i = 0; i < slist.size(); i++) {
			System.out.println(slist.get(i));
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<Student> slist;

		slist = fillupStudent();
		printStudent(slist);
		// More code to test the methods in each Class Object
	}

}
