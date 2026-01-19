import java.util.Scanner;
public class RepeatAdditionQuiz_Method_02{
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
    while(true){
      if(ans==sum){
        System.out.println("Correct! The answer is="+sum);
        break;
      }
      else if(ans!=sum){
        System.out.println("Wrong Answer!Try again!");
        ans=sc.nextInt();
      }
    }
  }
}

        
        
        
        