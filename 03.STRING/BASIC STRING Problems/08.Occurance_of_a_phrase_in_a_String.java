// Finding occurance of a phrase in a String;

import java.util.Scanner;
public class Occurance_of_a_phrase_in_a_String {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String s3="";
    int count=0;
    for(int i=0; i<s1.length(); i++){
      if(s1.charAt(i)==s2.charAt(0)){
        for(int j=0; j<s2.length(); j++){
          if(s2.charAt(j)==s1.charAt(i)){
            s3+=s1.charAt(i);
            i++;                          //we've to traverse the whole S1 to check!
            if(s3.equals(s2)){
              count++;                  //This if condition to check the number of occurance;
              s3="";
            }
          }
          else{
            s3="";                    //We've to empty the String if fails to match;
            break;
          }
        }
      }
    }
    System.out.println(s3);        //This print is a checker in this case; it should always be empty to indicate the code works fine;
    
    System.out.println("Occurance: "+count+" times");
  }
}

