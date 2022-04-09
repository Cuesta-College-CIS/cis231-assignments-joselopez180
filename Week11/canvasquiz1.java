package Week11;
import java.util.Scanner;
import java.util.Arrays;
public class canvasquiz1 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        printName("Juan", 429, 19);
     }

        public static void printName(String name, int id) {
            System.out.print(name + " ID: " + id);
         }
         public static void printName(int id) {
            System.out.print("Name" + " ID: " + id);
         }
         public static void printName(String name, int id, int age) {
            System.out.print(name + " ID: " + id + " age: " + age);
         }




    
}
