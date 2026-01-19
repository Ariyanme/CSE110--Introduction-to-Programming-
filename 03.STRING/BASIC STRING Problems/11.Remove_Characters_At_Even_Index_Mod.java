
// Write a java program that takes a String as input and remove the characters at even index 
// and prints the resulting  String in Uppercase.
// "Saiful Islam"="AFL ILM" 

import java.util.Scanner;
public class Remove_Characters_At_Even_Index_Mod{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String empty="";
    for(int i=0; i<s1.length(); i++){
      char a=s1.charAt(i);
      if(i%2!=0){
        if((int)a>=65 && (int)a<=90){            
          empty+=a;
        }
        else if((int)a>=97 && (int)a<=122){
          empty+=(char)(a-32);
        }
      }
      if(a==' '){                     //Adds the space in between; 
        empty+=a;                     
      }
    }
    System.out.println(empty);
  }
}


