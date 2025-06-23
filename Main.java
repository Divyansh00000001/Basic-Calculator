
import java.util.*;

public class Main {

    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         while(true) {
             System.out.print("Enter first number : ");
             float FirstNumber = sc.nextInt();

             System.out.print("Enter second number : ");
             float SecondNumber = sc.nextInt();

             System.out.print("Enter the operation(+, -, *, /, %) : ");
             String options = sc.next();

             switch (options) {
                 case "+":
                     System.out.println("Addition is : " + (FirstNumber + SecondNumber));
                     break;

                 case "-":
                     if (SecondNumber > FirstNumber) {
                         System.out.println("Subtraction is negative : " + (FirstNumber - SecondNumber));
                     } else {
                         System.out.println("Subtraction is : " + (FirstNumber - SecondNumber));
                     }
                     break;

                 case "*":
                     System.out.println("Multiplication is : " + (FirstNumber * SecondNumber));
                     break;

                 case "/":
                     if (SecondNumber == 0) {
                         System.out.println("Cannot divide by 0");
                     } else {
                         System.out.println("Division is : " + (FirstNumber / SecondNumber));
                     }
                     break;

                 case "%":
                     if (SecondNumber == 0) {
                         System.out.println("Cannot find the modulus");
                     } else {
                         System.out.println("Modulus is : " + (FirstNumber % SecondNumber));
                     }
                     break;

                 default:
                     if (!options.equals("+, -, *, /, %")) {
                         System.out.println("Invalid operation");
                     }
             }
                     System.out.print("Do you want to perform another calculation (y/n) : ");
                     String choice = sc.next();
                     if (choice.equals("n") || choice.equals("N")) {
                         break;
                     }
         }

         System.out.print("Exiting");
         for(int i = 1; i < 3; i++){
             System.out.print(".");
         }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println();
         System.out.println("Calculator exited. Thank You!");

    }
}