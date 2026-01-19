
import java.util.Scanner;
public class String_Suffix{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String s3=sc.nextLine();
    String empty="";
    int count=0;
    for(int i=s1.length()-1; i>=0; i--){
      
      for(int j=s2.length()-1; j>=0; j--){
        
        for(int k=s3.length()-1; k>=0; k--){
          char a=s1.charAt(i);
          char b=s2.charAt(j);
          char c=s3.charAt(k);
          if(a==b && a==c){
            empty+=c;
            count++;
            i--;
            j--;
          }
          else{
            break;        //as usual;
          }
        }
      }
      break;             //The outer loop runs only once bcz most inner for loop does the whole trick!
    }
    String reverse="";
    for(int i=empty.length()-1; i>=0; i--){
      reverse+=empty.charAt(i);
    } 
    System.out.println("Suffix: "+reverse);
    System.out.println("length: "+count);
  }
}
  
  