import java.util.Scanner;

public class Homework6 {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = input.nextInt();
    int sum = 0;
    int count = 0;
    for(int i = 1; i <= n; i++) {
      
      if(n % i == 0 && i != n) {
      
        sum += i;
        count++;
      }
      
    }
    if(count > 1) {
    
      System.out.println(n + " is not a prime number");
    }
    else{
    
      System.out.println(n + " is a prime number");
    }
    if(sum == n) {
    
      System.out.println(n + " is a perfect number");
    }
    else{
    
      System.out.println(n + " is not a perfect number");
    }
  }
}