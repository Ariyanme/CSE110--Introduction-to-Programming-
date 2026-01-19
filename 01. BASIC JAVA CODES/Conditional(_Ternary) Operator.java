import java.util.Scanner;
public class test1011{
  public static void main(String[]args){
    Scanner kb=new Scanner(System.in);
    int a=kb.nextInt();
    int b=kb.nextInt();
    int max=(a>b)?a:b;
    System.out.println("Maximum value is: "+max);
    
    int result=(a>b)? (a-b):(a+b);  //since a>b, (a-b) will remain positive;
    System.out.println("Result: "+result);
  }
}

    
    