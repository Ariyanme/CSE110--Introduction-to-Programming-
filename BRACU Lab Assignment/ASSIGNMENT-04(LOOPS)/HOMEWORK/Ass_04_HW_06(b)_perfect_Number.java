// Perfect number;

import java.util.Scanner;
public class perfect_Number{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int n=sc.nextInt();
    int sum=0;                // here's condition is the main play;
    for(int i=1;i<n;i++){     // i<n excludes the number itself;
      if(n%i==0){
        System.out.print(i+" ");
        sum+=i;
      }
    }                        // sum!=0; to avoid 0 being perfect number;
    if(sum==n && sum!=0){ 
      System.out.println("\n\n"+n+" is a perfect number");
    }
    else{
      System.out.println("\n\n"+n+" is a regular number");
    }
  }
}
    
    
    
    
    
    
    
    