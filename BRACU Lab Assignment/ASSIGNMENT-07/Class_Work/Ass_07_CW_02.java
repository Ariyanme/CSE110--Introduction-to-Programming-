/* Write a Java program to check if a string is palindrome or not. A string is palindrome if the
reverse of the string is the same as the original string. */

import java.util.Scanner;
public class Ass_07_CW_02{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String: ");
    String s1=sc.nextLine();
    String s2= "";                  //we've to reverse the string;
    boolean flag=false;        
                                          
    for(int i=s1.length()-1;i>=0;i--){     // index is always 0-length()-1;
      char c1=s1.charAt(i);
      s2=s2+c1;
    }
    if(s2.equals(s1)){                   //checking if the reverse string matches or not;
      flag=true;
    }
    
    System.out.println("\n"+flag);      
  }
}
    
      
      
      
      
      
      
      
      
