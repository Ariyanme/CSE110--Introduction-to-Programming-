/*Write a Java program that asks the user for a range, a starting number(inclusive) and an
ending number (inclusive). Then, take another input for checking. If the product of all the
digits of each number in the range is divisible by the third input, then print the number. */

import java.util.Scanner;
public class Ass_05_HW_07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Starting Number:");
    int m=sc.nextInt();
    System.out.print("Ending Number:");
    int n=sc.nextInt();
    System.out.print("Checker:");
    int c=sc.nextInt();
    
    System.out.println("\nProducts of digits from "+m+" to "+n+" that are divisible by "+c+" are:\n");
    
    for(int i=m;i<=n;i++){           //This loop to iterate numbers from m-n;
      
      int temp=i;
      int product=1;
      
      while(temp>0){            //this loop to extract numbers and get their products;
        
        int digit=temp%10;    
        
        product=product*digit;         //E.g: 25=2x5, 26=2x6,....30=3x0
        temp=temp/10;
      }
      if(product%c==0){                   //if 10,12,...0 are divisible by Checker or not;
        System.out.print(product+"  ");
      }
    }
  }
}
    
    
    
    
    
    
    
    
    
    
    
    