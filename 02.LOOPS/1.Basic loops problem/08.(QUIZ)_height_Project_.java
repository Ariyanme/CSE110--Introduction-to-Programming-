/*Suppose you are making a program for your class project. You will take the height of N number of students
from the user. Among those numbers you have to find out the maximum height. You will also have to find the 
difference between maximum and average height.*/

import java.util.Scanner;
public class height_Project_{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N=");
    int n=sc.nextInt();
    int count=0;          //A counter to count how many inputs are taken.
    float max=0;
    float sum=0;
    while(count<n){         //The code will run n times. 
      System.out.print("Enter height:");
      float h=sc.nextFloat();
      
      if(h>max){        //used condition for getting the maximum height;
        max=h;      
      }
      sum+=h;
      count++;          
    }
    float average=sum/n;
    float dif=max-average;
    System.out.println("\nMaximum height:"+max+"\n\nAverage height:"+average);
    System.out.println("\nThe difference between max height and average height is:"+dif);
  }
}
    
    
    
    
    
    
      
    
    
    
    
    
    
    
    
    
    
    
    