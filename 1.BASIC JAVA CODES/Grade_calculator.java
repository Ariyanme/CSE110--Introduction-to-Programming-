import java.util.Scanner;
public class Grade_calculator  {
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the Marks: ");
    double mark=sc.nextDouble();
    if(mark>=90 && mark<=100){
      System.out.println("A");
    }
    else if(mark>=85 && mark<=89){
      System.out.println("A-");
    }
    else if (mark>=70 && mark<=84){
      
      System.out.println("B");
    }
    else if (mark>=57 && mark<=69){
      System.out.println("C");
    }
    else if (mark>=50 && mark<=56){
      System.out.println("D");
    }
    else if (mark<50){
      System.out.println("FAIL");
    }
    
  }
}
