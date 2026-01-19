//Prime Numbers from m to n

import java.util.Scanner;
public class prime_from_M_to_N{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter m:");
    int m=sc.nextInt();
    System.out.print("Enter n:");
    int n=sc.nextInt();
    
    int prime=0;             //To count how many prime numbers are there;
    for(int i=m;i<=n;i++){
      int divcount=0;      //you must initialize just before the start of a loop otherwise,error;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          divcount++;
        }
      }
      if(divcount==2){
        System.out.print(i+" ");
        prime++;
      }
    }
    System.out.println("\nThere are "+prime+" prime numbers between "+m+" to "+n);
  }
}
