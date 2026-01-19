import java.util.Scanner;
public class Homework1 {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    System.out.print("Input number of terms: ");
    int n = input.nextInt();
    int sum = 0, count = 0, i =1;
    System.out.println("\n The odd numbers are:");
    
    while(true) {
      if(count == n) {
      
        break;
      }
      else if ( i % 2 != 0) {
      
        System.out.println(i);
        sum = sum + i;
        count++;
      }
      i++;
      
    }
    System.out.println("The Sum of odd Natural Numbers up to " + n + " terms is: " + sum);
  }
}