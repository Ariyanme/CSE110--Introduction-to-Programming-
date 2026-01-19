// Alternative method of checking if it's a palindrome or not!

import java.util.Scanner;
public class pal2{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=sc.nextInt();
    
    int temp=n;
    int r=0;
    int sum=0;
    
    while(temp!=0){
      r=temp%10;
      
      sum=sum*10+r;      //Try to think and understand the logic doing rough work;
      
      System.out.println(sum+"\n");  //just to visualize how the logic is working;
      
      temp=temp/10;
    }
    System.out.println("\nReverse number is:"+sum);
    
    if(sum==n){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not a palindrome");
    }
  }
}