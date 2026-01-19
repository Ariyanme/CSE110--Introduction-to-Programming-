// Checking if a number is palindrome or not!

import java.util.Scanner;
public class pal{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n=sc.nextInt();
    
    String s2=Integer.toString(n);     //Converting n to string and storing in a String vari.
    
    int temp=n;
    int r;
    String s1="";           //Creating an empty String to store the reversed numbers;
    
    while(temp!=0){
      r=temp%10;
      s1+=r;
      temp=temp/10;
    }
    
    System.out.println("\nReverse number is:"+s1);
    
    if(s2.equals(s1)){                     //if both the string matches, it's palindrome;
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not a palindrome");
    }
  }
}

    
    
    
    
    
    
    
    
