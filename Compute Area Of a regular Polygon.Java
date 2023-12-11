package compute.area.of.a.regular.polygon;
import java .util.Scanner;
public class ComputeAreaOfARegularPolygon {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number of sides of the regular polygon ");
        double n = input.nextDouble();
        System.out.println("Enter the side:");
      double s =input.nextDouble();
      double Area =(n*(Math.pow(s,2)))/(4*(Math.tan(Math.PI/n)));
        System.out.println("The area of the regular polygon is "+Area);
    }
    
}
    
    

