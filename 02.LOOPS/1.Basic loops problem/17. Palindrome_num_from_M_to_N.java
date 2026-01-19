// 1. generate and print palindrome numbers from m-n 
// 2. count and print number of palindrome numbers


import java.util.Scanner;
public class Assignment14 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      System.out.print("Starting number: ");
      int m = input.nextInt();
      System.out.print("Ending number: ");
      int n = input.nextInt();
      
      int palcount=0;         // counter for palindrome numbers;
      
      System.out.println("\nPalindrome numbers between "+m+" to "+n+" are: ");
      
      for(int i=m; i<=n; i++){   //This loop for checking m to n;
        int temp=i;
        int r;
        int sum=0;
        
        while(temp!=0){      //This loop for Checking if the particular num. is palindrome or not;
          
          r=temp%10;
          sum=sum*10+r;
          temp=temp/10;
        }
        
        if(sum==i){
          System.out.print(i+"  ");
          palcount++;
        }
      }
      System.out.println("\n\nTotal Palindrome numbers: "+palcount);
   }
}
    
  
