import java.util.Scanner;
public class VowelConsonantChecker{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an Alphabet: ");
    char x=sc.next().charAt(0);
    if(x=='a' || x=='e'||x=='i'||x=='o'||x=='u'){
      System.out.println(x +" is Vowel");
    }
    else{
     System.out.println(x +" is consonant");  
    }
  }
}