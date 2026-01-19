// print N perfect numbers starting from 2;

import java.util.Scanner;
public class N_perfect_Number{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N:");
    int n=sc.nextInt();
                       // this a variable actually represents the perfect numbers(2++);  
    int a=2;             
    
    int pcount=0;         // perfect counter;
    System.out.println("\n"+n+" perfect numbers starting from 2 are: \n");
    while(true){
      if(pcount==n){ 
        break;
      }
      else{
        int sum=0;    //i<a; perfect number is the sum of it's div. excluding the num. itself
        for(int i=1;i<a;i++){  
          if(a%i==0){  // to get it's divisors and sum them up;
            sum+=i;
          }
        }
        if(sum==a){
          System.out.println(a);
          pcount++;
        }
        a++;     //increment to the next number from 2 to 3,4,5,6...n       
      }
      
    }
  }
}
        
        
        
        
        
        
        
        
        