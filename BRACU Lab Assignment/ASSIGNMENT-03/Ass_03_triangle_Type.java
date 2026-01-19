import java.util.Scanner;
public class Ass_03_triangle_Type {
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a: ");
    int a=sc.nextInt();
    System.out.println("Enter b: ");
    int b=sc.nextInt();
    System.out.println("Enter c: ");
    int c=sc.nextInt();
    
    //check for valid triangle formation
    
    if(a+b<=c || b+c<=a || c+a<=b){
      System.out.println("Invalid triangle");
    }
    //check for triangle type 
    
    else{
      if (a==b && b==c){
      System.out.println("This is an Equilateral triangle");
      }
      else if(a==b || b==c|| c==a){
      System.out.println("This is an Isosceles triangle");
      }
      else{
      System.out.println("This is a Scalene triangle");
    }
  }
  }
}
