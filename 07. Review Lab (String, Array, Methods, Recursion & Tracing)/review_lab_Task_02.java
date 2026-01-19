
// Review Lab_Task-02;

import java.util.Scanner;
public class review_lab_Task_02{
  
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("S");
    String s=sc.nextLine();
    System.out.println("S1");
    String s1=sc.nextLine();
    System.out.println("S2");
    String s2=sc.nextLine();
    
    modifyStrings(s, s1, s2);
  }
  
  public static void modifyStrings(String s, String s1, String s2){
    
    String mod="";
    for(int i=0; i<s.length(); i++){
      boolean flag=false;
      if(s.charAt(i)==s1.charAt(0)){
        for(int j=0; j<s1.length(); j++){
          if(s.charAt(i)==s1.charAt(j)){
            flag=true;
            i++;
          }
        }
        if(flag){
          mod+=s2;
          i--;        //to balance out the extra i added after flag being true;
        }
      }
      if(!flag){
        mod+=s.charAt(i);
      }
    }
    System.out.println(mod);
  }
}
