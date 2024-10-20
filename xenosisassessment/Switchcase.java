import java.util.Scanner;

public class Switchcase {
      static Scanner sc = new Scanner(System.in);

      public static void main(String[] args) {
        
        System.out.print("Enter first number: ");
      int num1=sc.nextInt();
      System.out.print("Enter second number: ");
      int num2=sc.nextInt();
      System.out.print("Enter operator only ( + , - , * , /): ");
      char op=sc.next().charAt(0);;

      int result;

      switch(op){
        case '+':
               result = num1 + num2;
               System.out.println("Result: " + result);
               break;

        case '-':
               result = num1 - num2;
               System.out.println("Result: " + result);
               break;

        case '*':
               result = num1 * num2;
               System.out.println("Result: " + result);
               break;

        case '/':
        if(num2!=0)
        {
            
            result = num1 / num2;
            System.out.println("Result: " + result);

        }else{
            System.out.println("number cannot divisible by zero.");
        }
         break;

         default:
                System.out.println("Error: Invalid operator.");
                break;

      }
      }
      

}
