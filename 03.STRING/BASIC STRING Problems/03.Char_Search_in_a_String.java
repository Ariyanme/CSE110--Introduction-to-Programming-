

// Character search in a String;

import java.util.Scanner;
public class String_testing_01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    System.out.print("Enter a character to Search:");
    char c1=sc.nextLine().charAt(0);
    boolean flag=false;               //initializing a boolean var. to false!;
    int count=0;
    
    for(int i=0;i<s1.length();i++){   //loop for iterating each char. out of the string;
      char c2=s1.charAt(i);
      int ascii=(int)c2;              //convert the chart. to ascii value(int);
      
      if(ascii==(int)c1){             //Matching with the char;
        flag=true;
        count++;                      //changing the boolean to true if matches!
      }
    }
    if(count>0){
      System.out.println("\n"+flag+"! It matched "+count+" times");
    }
    else{
      System.out.println("\n "+flag+"! It didn't match.");
    } 
  }
}
        
        
        
        
        
        
        