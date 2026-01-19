//Fibonacci Series;
// 0,1,1,2,3,5,8,13,21,34...n
// think & understand the pattern first;

import java.util.Scanner;
public class fibonacci_Series{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("How many fibonacci numbers do you want to print?");
    int n=sc.nextInt();
    int first=0;
    int second=1;
    int fibo;                                 //we print 0,1 in the first place;
    System.out.print("\n"+first+" "+second); 
    
    for(int i=1;i<=n-2;i++){        // n-2 bcz we've already printed first 2 fibos;      
      fibo=first+second;
      System.out.print(" "+fibo);
      first=second;                       
      second=fibo;                 // look at the patern you'll understand;
    }
    System.out.println();
  }
}

    