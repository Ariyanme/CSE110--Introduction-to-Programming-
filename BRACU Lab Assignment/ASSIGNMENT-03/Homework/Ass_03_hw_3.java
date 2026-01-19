import java.util.Scanner;
public class Ass_03_hw_3 {
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of X: ");
    int x=sc.nextInt();
    int result;
    if(x<0){
      result=2*x;
      System.out.println("output: "+ result);
    }
    else if(x>=0 && x<2){
      result=x+1;
      System.out.println("output: "+ result);
    }
    else if(x>=2 && x<5){
      result=(x*x)-1;
      System.out.println("output: "+ result);
    }
    else if(x>=5){
      result=(3*(x*x))+2;
      System.out.println("output: "+ result);
    }
    
    }
  }
      
      
      
      