import java.util.Scanner;

public class Homework5 {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter a number");
    int number = input.nextInt();
    int temp = number;
    
    //checking the number of digits
    while(true) {
    
      if (temp / 10 != 0) {
      
        count++;
        temp = temp / 10;
      }
      else {
        break;
      }
    }
    
    int divisor = (int)Math.pow(10, count);
    
    while(divisor >= 1) {
      
      int digit = number / divisor;
      number = number % divisor; 
      
      if(divisor == 1) {
      
        System.out.print(digit);
      }
      
      else {
        System.out.print(digit + ", ");
      }
      divisor = divisor / 10;
    }
  }
}