// assignment-06;
// rhombus 
// I've solved this problem by dividing the whole rhombus into two different triangles.

import java.util.Scanner;
public class testingR{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Vertical diagonal length:");
    int n=sc.nextInt();
    
    for(int i=1;i<=n-1;i++){             // 1st loop is for upper triangle.
      
      for(int j=1;j<=n-i;j++){
        System.out.print("  ");
      }
      for(int k=1;k<=2*i-1;k++){
        System.out.print(k+" ");
      }
      System.out.println();
    }
    
    for(int i=1; i<=n;i++){
      for(int j=1;j<=i-1;j++){           
        System.out.print("  ");           //2nd loop is for lower triangle.
      }
      for(int k=1;k<=2*(n-i)+1;k++){
        System.out.print(k+" ");
      }
      System.out.println();
    }
  }
}

      
    
    
      
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    