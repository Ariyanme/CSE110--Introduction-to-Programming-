// assignment_07
// Hollow Rhombus
// Like the previous one, i've solved it by dividing into 02 different triangles.

import java.util.Scanner;
public class testingH{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Vertical diagonal length:");
    int n=sc.nextInt();
    
    for(int i=1; i<=n-1;i++){
      for(int k=1;k<=n-i+1;k++){       //1st loop for upper triangle
        System.out.print(" ");
      }
      for(int j=1;j<=2*i-1;j++){
        if(j==1 || j==2*i-1){
          System.out.print(j+" ");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    
    for(int i=1;i<=n;i++){
      for(int k=1; k<=i;k++){              
        System.out.print(" ");             // 2nd loop for lower triangle.
      }
      for(int j=1;j<=(n*2+1)-2*i; j++){
        if(j==1 || j==(n*2+1)-2*i ){
          System.out.print(j+" ");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}

          
        
        
        
        
        
        
        
        
        
        
        
        