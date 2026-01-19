
// Removing the duplicate character from a string;

import java.util.Scanner;
public class Removing_duplicate_Character_from_a_String{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String mod="";
    
    for(int i=0; i<s1.length(); i++){
      char a=s1.charAt(i);
      boolean flag=true;
      for(int j=0; j<s2.length(); j++){
        char b=s2.charAt(j);
        if(a==b || a-32==b || a+32==b){       //to check irrespective of the cases
          flag=false;
          break;
        }
        else{
          flag=true;
        }
      }
      if(flag){                        //Stores it after checking the whole String;
        mod+=a;                     
      }
    }
    System.out.println(mod);
  }
}
        
        
        
        
        
        
        
        
        
    
    