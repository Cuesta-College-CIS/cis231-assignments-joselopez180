// Simple class to hold student information
class Student {
    private String name;
    private double gpa;
    
    // FIXME: define two private member fields
    public Student() {
       this.name = "Louie";
       this.gpa = 1.0;
    }
     
    public void setName(String name) {
        //FIXME: assign parameter to instance field  
        this.name = name;
    }
    
    // FIXME: Add three more methods
       public String getName(){
       return name;
    }
    
       public double getGPA(){
       return gpa;
    }
 
    public void setGPA(double gpa){
       this.gpa = gpa;
    }
    
 }


public class StudentClass {
    public static void main(String[] args) {
       Student student = new Student();
       System.out.println(student.getName() + "/" + student.getGPA());
       
       student.setName("Felix");
       student.setGPA(3.7);
       System.out.println(student.getName() + "/" + student.getGPA());
    }
 }
