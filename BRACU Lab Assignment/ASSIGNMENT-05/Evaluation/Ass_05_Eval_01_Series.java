/*Write a Java code of a program that reads the value of N from the user and calculates the
value of y if the expression of y is as follows:
  
? = ? (1) ? (1 + 2) ? (1 + 2 + 3) ? . . . . ? (1 + 2 + 3 + . . . + ?)  */

import java.util.Scanner;
public class Series_Test{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter N: ");
    int n=sc.nextInt();
    int sum=0;
    
    for(int i=1;i<=n;i++){        //Outer loop for number of total occurance;
      
      for(int j=1;j<=i;j++){     // Inner loop for (1)+(1+2)+(1+2+3)+....+(1+2+3+N);
        sum+=j;
      }
    }
    
    System.out.println("\nThe value of Y= "+(-1)*sum);     //just need to multiply -1 as accordance;
  }
}
    
    
    
    
    
      