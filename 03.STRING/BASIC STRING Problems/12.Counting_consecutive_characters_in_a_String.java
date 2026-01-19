
// Counting the consecutive occurances of characters in a String;

import java.util.Scanner;
public class Counting_consecutive_characters_in_a_String{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String empty="";
    char currentChar = s1.charAt(0);
    int count = 0;
    
    for (int i = 0; i < s1.length(); i++) {
      
      if (s1.charAt(i) == currentChar) {             
        count++;
      } 
      else {                                         
        empty+=(currentChar+""+count);   
        currentChar = s1.charAt(i);               
        count = 0;
        i--;                           // i-- To regain the unmatched character back.
      }
    }
    empty+=(currentChar+""+count);
    System.out.print(empty);                     
  }
}
