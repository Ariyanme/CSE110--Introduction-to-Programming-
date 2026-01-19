// Finding phrasal pattern in a String;

import java.util.Scanner;
public class Find_pattern_in_String{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String s3="";
    for(int i=0; i<s1.length(); i++){
      if(s1.charAt(i)==s2.charAt(0)){
        for(int j=0; j<s2.length(); j++){
          if(s2.charAt(j)==s1.charAt(i)){
            s3+=s1.charAt(i);
            i++;                          //magic!! we've to traverse the S1 to check!
          }
          else{
            break;
          }
        }
      }
    }
    System.out.println(s3);
    if(s3.equals(s2)){
      System.out.println("Pattern Found");
    }
    else{
      System.out.println("Not Found");
    }
  }
}

          
          
          
          
          
          
          
          