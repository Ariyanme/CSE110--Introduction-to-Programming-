// reverse a number
// e.g: if number is 1234, reverse it to 4321;

import java.util.Scanner;
public class reverse_Number{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number");
    int n=sc.nextInt();
    int temp=n;         //we've to set a temporary variable;
    
    int rev;
    while(temp!=0){ 
      rev=temp%10;     // remainder is the last digit of 1234; (1234%10=4).
      System.out.print(rev+"");
                    
      temp=temp/10;        // Then we've to restore the temp(1234/10=123)
    }
    System.out.println();
  }
}