import java.util.Scanner;
//If you add the class path Week13. You don’t need to use the statement “Package Week13"
class Triangle {
   private double base;
   private double height;
   
   public void setBase(double userBase){
       base = userBase;
   }
   public void setHeight(double userHeight) {
       height = userHeight;
   }
   
   public double getArea() {
       double area = 0.5 * base * height;
       return area;
   }
   
   public void printInfo() {
       System.out.printf("Base: %.2f\n", base);
       System.out.printf("Height: %.2f\n", height);
       System.out.printf("Area: %.2f\n", getArea());
   }
   
}

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
      double base = scnr.nextDouble();
      double height = scnr.nextDouble();

      triangle1.setBase(base);
      triangle1.setHeight(height);

      // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
       base = scnr.nextDouble();
       height = scnr.nextDouble();

      triangle2.setBase(base);
      triangle2.setHeight(height);

      // TODO: Determine larger triangle (use getArea())
      double area1 = triangle1.getArea();
      double area2 = triangle2.getArea();

      System.out.println("Triangle with larger area:");

      // TODO: Output larger triangle's info (use printInfo())
      if(area2 > area1)
         triangle2.printInfo();

      else
         triangle1.printInfo();
   }
}
