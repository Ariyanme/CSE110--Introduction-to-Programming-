// assignment-02;

import java.util.Scanner;
public class pat_02{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Height:");
    int h=sc.nextInt();
    int row,col;              //this loop for height  
    for( row=1;row<=h;row++){   
      for( col=1;col<=h-row;col++){ //this loop for space.
        System.out.print(" ");
      }
      for( col=1;col<=row;col++){   //this loop for printing numbers.
        System.out.print(col);
      }
      for( col=row-1;col>=1;col--){  //avoiding printing same number twice in the mid column.
        System.out.print(col);
      }
      System.out.println();
    }
  }
}
      
      
      
      
      
      
      