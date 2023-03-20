package URL_Class;

import java.util.Scanner;

public class UserInput {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try{

            Scanner scanner = new Scanner(System.in);
        
            System.out.println("What is you Name:");
            String name = scanner.nextLine();
            
            System.out.println("How old are you");
            int age = scanner.nextInt();
            scanner.nextLine(); //just clearing the scanner for another question.

            System.out.println("What is your favroite food");
            String food = scanner.nextLine();
            
            System.out.println("  - Welcome " +  name);
            System.out.println("  - you are "+age+ " Years old");
            System.out.println("  - You like "+ food);

        }
    
        catch(Exception e)
        {
            System.out.println("Error "+ e);
        }
        
  

    }

    
}
