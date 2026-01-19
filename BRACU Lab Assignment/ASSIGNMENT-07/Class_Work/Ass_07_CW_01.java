/*Write a Java program that will take a String as input and convert the lowercase letters to the
uppercase letters. */

import java.util.Scanner;
public class Ass_07_CW_01 {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String: ");
    String s1=sc.nextLine();
    String s2="";                        //Empty String for storing characters;
    
    for(int i=0;i<s1.length();i++){      //loop for extracting characters;
      
      char c1=s1.charAt(i);             //converting char. to their ascii values;
      int ascii=(int)c1;               
      
      if(ascii>=97 && ascii<=122){     //Comparing their ascii values;
        
        char c2=(char)(ascii-32);      //converting their ascii's to upperCase;
        s2=s2+c2;
      }
      else{
        s2=s2+c1;                     //If it's already uppercase don't need to change;
      }
    }
    System.out.println("\nUpperCase: "+s2);
  }
}
  
        
        
        
        
        
        
        
        
    
 