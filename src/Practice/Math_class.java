package Practice;
import java.util.Scanner;


public class Math_class {

    public static void main(String[] args) {


        double x;
        double y;
        double z;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x :");
        x = scanner.nextDouble();

        System.out.println("Enter side y:");
        y = scanner.nextDouble();

        z = Math.max(x, y);

        System.out.println("The Max Value is : " + z);
        
        scanner.close();
        

        
    }


  

    
}
