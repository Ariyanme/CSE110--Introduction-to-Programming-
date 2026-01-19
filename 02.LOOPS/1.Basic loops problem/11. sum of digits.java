//Sum of digits;
// e.g:if any number is 1234, sum should be (1+2+3+4)=10;

import java.util.Scanner;
public class abcc{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number");
    int n=sc.nextInt();
    int temp=n;         //we've to set a temporary variable;
    int sum=0;
    int remain;
    while(temp!=0){ 
      remain=temp%10;     // remainder is the last digit of 1234; (1234%10=4).
      System.out.print(remain+" ");
      sum+=remain;               
      temp=temp/10;        // Then we've to restore the temp(1234/10=123)
    }
    System.out.println("\nThe sum is: "+sum);
  }
}

    
    
    
    
    
      
      
      
      
      
      
      
      
      
      
    
  

    
    

