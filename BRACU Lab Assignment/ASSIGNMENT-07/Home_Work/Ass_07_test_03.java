import java.util.Scanner;
public class Ass_07_test_03{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String: ");
    String s1=sc.nextLine();
    System.out.print("Enter another String: ");
    String s2=sc.nextLine();
    
    String s3=s1+s2;
    String s4="";
    
    for(int i=0;i<s3.length();i++){
      String ch=""+s3.charAt(i);
      
      if(s4.contains(ch)){
        continue;
      }
      s4+=ch;
      
    }
    System.out.println(s4);
    
    String s5="";
    
    for(int i=0;i<s4.length();i++){
      int ascii=(int)s4.charAt(i);
      ascii=ascii-32;
      s5=s5+(char)ascii;
    }
    System.out.println(s5);
      
    
  }
}