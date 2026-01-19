import java.util.Scanner;
public class Ass_03_Homework_1 {
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a: ");
    int a=sc.nextInt();
    System.out.println("Enter the Operator: ");
    char op=sc.next().charAt(0);
    System.out.println("Enter b: ");
    int b=sc.nextInt();
    
    int result;
    if(op== '+'){
      result=a+b;
      System.out.println(result);
    }
    else if(op== '-'){
      result=a-b;
        
      System.out.println(result);
    }
    else if (op== '*'){
      result=a*b;
      System.out.println(result);
    }
    else if(op== '/'){
      if(b==0){
        System.out.println("Divided by Zero: Math Error");
      }
      else{
        result=a/b;
        System.out.println(result);
      } 
    }
    else{
      System.out.println("The Operator is invalid");
  }
}
}
    
    
    
    
 