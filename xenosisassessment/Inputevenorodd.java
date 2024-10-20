import java.util.Scanner;

public class Inputevenorodd {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
      System.out.println("entre a number");
      int num =sc.nextInt();
      if(num%2 ==0){
        System.out.println( num + " is even number ");
      }
      else{
        System.out.println(num + " is odd number");
      }

    }
    
}
