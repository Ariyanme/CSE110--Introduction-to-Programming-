import java.util.Scanner;
public class Ass_07_test_01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a String: ");
    String s1=sc.nextLine();
    String a[]=s1.split(" ");
    
    
    for(int i=a.length-1;i>=0;i--){
      System.out.print(a[i] +" ");
    }
  }
}
    