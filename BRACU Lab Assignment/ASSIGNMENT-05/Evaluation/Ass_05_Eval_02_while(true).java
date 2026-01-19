/*Write a Java program that will keep taking even positive integer numbers as inputs from
the user and print the number of divisors of those numbers until it gets an odd number
and then stops.*/

import java.util.Scanner;
public class Ass_05_Eval_02{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    
    while(true){
      System.out.print("Enter an even positive Integer: ");
      int n=sc.nextInt();
                                   
      if(n>0 && n%2==0){          //Checking conditions;        
        int divcount=0;
        
        for(int i=1;i<=n;i++){          //This for loop is for counting divisors;
          if(n%i==0){
            divcount++;
          }
        }
        System.out.println("\n"+n+" has "+divcount+" divisors\n");
      }
      else{
        System.out.println("\nInvalid Input");
        break;                                 
      }
    }
  }
}
            
        
        
        
        
        
        
        
        
        
        
        
        
  