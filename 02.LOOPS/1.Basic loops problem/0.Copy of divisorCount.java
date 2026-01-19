//write a java code to count divisors from number M-N;

import java.util.Scanner;
public class divisorCount{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter M: ");
    int m=sc.nextInt();
    System.out.println("Enter N: ");
    int n=sc.nextInt();
    for(int i=m;i<=n;i++){
      int div=0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          div++;
        }
      }
      System.out.println(i+" has "+div+" divisor(s)");
    }
  }
}
