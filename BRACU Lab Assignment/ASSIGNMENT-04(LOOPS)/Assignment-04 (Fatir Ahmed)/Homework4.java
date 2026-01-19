import java.util.Scanner;

public class Homework4 {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter a number");
    int number = input.nextInt();
    
    while(true) {
    
      if (number / 10 != 0) {
      
        count++;
        number = number / 10;
      }
      else {
        count++;
        System.out.println("Total digits= " + count);
        break;
      }
    }
  }
}