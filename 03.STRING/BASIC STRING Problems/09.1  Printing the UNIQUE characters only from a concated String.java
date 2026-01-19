
//Task-07

import java.util.Scanner;
public class Lab_Ass_05_HW_07{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String s3=s1+s2;
    String empty="";
    for(int i=0; i<s3.length(); i++){
      char a=s3.charAt(i);
      int ascii=(int)a;
      boolean flag=true;
      for(int j=0; j<s3.length();j++){
        char b=s3.charAt(j);
        if(b==a && i!=j){
          flag=false;
          break;
        }
        else{
          flag=true;
        }
      }
      if(flag){
        empty+=(char)(ascii-32);
      }
    }
    System.out.println(empty);
  }
}