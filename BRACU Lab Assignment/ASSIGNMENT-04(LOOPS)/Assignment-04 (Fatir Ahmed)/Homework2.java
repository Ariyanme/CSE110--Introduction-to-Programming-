import java.util.Scanner;

public class Homework2 {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    int sum = 0;
    
    for(int i = 0; i <= 9; i++) {
    
      System.out.print("Enter Number: ");
      int n = input.nextInt();
      sum = sum + n;
      System.out.println("\n Sum = " + sum);
    }
  }
}