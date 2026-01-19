// assignment-03;
//hollow rectangle

import java.util.Scanner;
public class pat_03{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Lenght:");
    int l=sc.nextInt();
    System.out.println("Enter Width:");
    int w=sc.nextInt();
    for(int i=1;i<=w;i++){   //outer loop for rows/width
      
      for(int j=1;j<=l;j++){    // inner loop for columns/lenght.     
        if(i==1 || j==1 || i==w || j==l){
          System.out.print(j);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
          
          
          
          
          
          
          
    
    
    
    
    
    
    
    