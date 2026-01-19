// assignment-04;
// Left justified hollow triangle;

import java.util.Scanner;
public class pat_04{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Height:");
    int h=sc.nextInt();
                                  //outer loop for rows
    for(int row=1;row<=h;row++){
      
      for(int col=1;col<=row;col++){   //inner loop for columns
        
        if(col==1 || row==h || col==row){
          System.out.print(col);      // for printing numbers.        
        }                                  
        else{
          System.out.print(" ");     // for hollow-spaces
        }
      }
      System.out.println();
    }
  }
}
          
          
          
          
          
          
          
          
          
          