import java.util.Scanner;
public class Homework3 {

  public static void main(String args[]) {
  
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int i = 1;
    
    while(i <= n) {
    
      if(i % 5 == 0 && i % 3 !=0 ) {
      
        System.out.println(i);
      }
      
      i++;
    }
  }
}