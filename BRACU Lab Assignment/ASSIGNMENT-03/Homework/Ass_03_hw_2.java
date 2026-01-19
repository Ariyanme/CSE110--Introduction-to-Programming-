import java.util.Scanner;
public class Ass_03_hw_2 {
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a Number: ");
    int x=sc.nextInt();
    if(x%7==0 && x%5==0){
      System.out.println("Divisible by Both");
    }
    else{
      if(x%7==0){
        System.out.println("Invalid: Divisible by 7 Only ");
      }
      else if(x%5==0){
        System.out.println("Invalid: Divisible by 5 Only ");
      }
      else{ 
        System.out.println("No");
      }
    }
  }
}