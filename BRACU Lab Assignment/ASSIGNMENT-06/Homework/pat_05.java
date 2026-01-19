// hollow isosceles triangle

import java.util.Scanner;
public class test_Isosceles{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter height:");
    int h=sc.nextInt();
    
    for(int i=1;i<=h;i++){ 
      
      for(int j=1;j<=h-i;j++){      
        System.out.print(" ");
      }
      for(int k=1;k<i*2;k++){          
        if(i==h || k==i*2-1 || k==1){
          System.out.print(k+"");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
      
      
      
      
      
      
      
      
      
      
      
      
      