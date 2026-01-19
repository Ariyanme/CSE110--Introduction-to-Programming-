//LoweCase to UpperCase;


import java.util.Scanner;
public class LowerCase_to_UpperCase{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String:");
    String s1 =sc.nextLine();
   
    String s2="";                      //empty string for storing the characters;
    
    for(int i=0;i<s1.length();i++){         //will run char. according to index 0,1,2,3,4...
      
      char c=s1.charAt(i);                  //will extract the characters from the String;
      
      if((int)c>=97 && (int)c <=122){         //checking if it's an LoweCase char. or not;
        int ascii=(int)c-32;
        s2=s2+(char)ascii;           // transforming into an UpperCase and storing in EMPTY String;
      }
      else{
        s2=s2+c;                 //If it's already an upperCase then don't need anything but just store;
      }
    }
    System.out.println("\nUpperCase: "+s2);
  }
} 