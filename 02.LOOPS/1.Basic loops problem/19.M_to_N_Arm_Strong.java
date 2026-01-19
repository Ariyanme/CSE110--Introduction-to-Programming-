// Printing Armstrong number from M-N;

import java.util.Scanner;
public class M_to_N_Arm_Strong {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
     System.out.print("Starting number: ");
     int m = input.nextInt();
     System.out.print("Ending number: ");
     int n = input.nextInt();
                                //To count how many armStrong numbers are there;
     int arm_strong_count=0;
     
     System.out.println("\nArmstrong numbers between "+m+" to "+n+" are:\n");
     
     for(int i=m;i<=n;i++){      //This loop for running all numbers between m-n;
       int temp=i;
       int temp2=i;
       int sum=0;
       int count=0;
       
       while(temp>0){                 //1st while loop for counting number of digits;
         temp=temp/10;
         count++;
       }
                                      //2nd while loop for armstrong detection;
       while(temp2>0){                  
         
         int digit=temp2%10;
         sum=sum+(int)Math.pow(digit,count);
         temp2=temp2/10;
       }
       
       if(sum==i){                      //condition check;
         System.out.print(i+"  ");         
         arm_strong_count++;
       }
     }
     
     System.out.println("\n\nTotal ArmStrong Number: "+ arm_strong_count);
   }
}
       
       
       
       
       
       
       
       
       
       
       
       
       
       

