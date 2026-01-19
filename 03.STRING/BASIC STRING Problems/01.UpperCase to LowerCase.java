//Upper Case to LoweCase;


import java.util.Scanner;
public class string_testing{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String:");
    String s1 =sc.nextLine();
   
    String s2="";                      //empty string for storing the characters;
    
    for(int i=0;i<s1.length();i++){         //will run char. according to index 0,1,2,3,4...
      
      char c=s1.charAt(i);                  //will extract the characters from the String;
      
      if((int)c>=65 && (int)c <=90){         //checking if it's an upperCase char. or not;
        int ascii=(int)c+32;
        s2=s2+(char)ascii;           // transforming into a lowerCase and storing in EMPTY String;
      }
      else{
        s2=s2+c;                 //If it's a lowercase already than don't need anything but just store;
      }
    }
    System.out.println("\nLowerCase: "+s2);
  }
} 