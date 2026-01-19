//y = 3 - 5 + 7 - 9 ….. nth term

import java.util.Scanner;
public class ex13{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n th term:");
    int n=sc.nextInt();
    int count=0;
    int sum=0;
    for(int i=3;i>=3;i+=2){
      count++;
      if(count>n){        //count>n; if the loop runs more than n time, code will end;
        break;
      }
      else{
        if(count%2!=0){
          System.out.print("+"+i);  //'+' with odd terms/positions;
          sum+=i;
        }
        else if(count%2==0){         //'-' with even terms;
          System.out.print(-i);
          sum-=i;
        }
      }
    }
    System.out.println("\nThe sum is:"+sum);
  }
}

  


      
      
    
  

