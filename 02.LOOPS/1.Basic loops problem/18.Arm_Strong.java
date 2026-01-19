// Checking if a number is ArmStrong or not!

import java.util.Scanner;
public class Arm_Strong {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     System.out.print("Enter a number: ");
     int n = input.nextInt();
                                //1st temp. var. for counting number of digits;
     int temp=n;    
     int temp2=n;              //2nd temp. var. for extracting digits and calc. Sum of them;
     int sum=0;
     int count=0;
     
     while(temp>0){           // 1st loop for counting digits;
       temp=temp/10;           
       count++;
     }
     
     while(temp2>0){             //2nd loop for extracting digits and calculate SUM;
       int digit=temp2%10;
       
       sum=sum+(int)Math.pow(digit,count);
       temp2=temp2/10;
     }
     
     if(sum==n){                                               //Condition test;
       System.out.println("\n"+n+" is a ArmStrong Number");
     }
     else{
       System.out.println("\nRegular Number");
     }
   }
}
       
       
       
       
       
       
       
       
       
       
       
     
     
    
     
      