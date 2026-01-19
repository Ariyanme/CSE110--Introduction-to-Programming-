/* A program that prompts the user to enter an answer for a question on addition of two single digits. Using a loop, you can now rewrite 
the program to let the user repeatedly enter a new answer until it is correct */


import java.util.Scanner;
public class RepeatAdditionQuiz{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("a=");
    int a=sc.nextInt();
    System.out.print("b=");
    int b=sc.nextInt();
    int sum=a+b;
    System.out.println("\nWhat is the result of "+a+"+"+b+" ?");
    System.out.print("Ans:");
    int ans=sc.nextInt();
    while(ans!=sum){
      System.out.println("Wrong Answer!Try it again!");
      ans=sc.nextInt();
    }
    System.out.println("Correct! The answer is="+sum);
  }
}
      
      
      
    
    
    
    
    
    
    