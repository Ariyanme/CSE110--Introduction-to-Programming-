import java.util.Scanner;
public class Ass_03_hw_8 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a: "); 
    int a=sc.nextInt();
    System.out.println("Enter b: ");
    int b=sc.nextInt();
    System.out.println("Enter c: ");
    int c=sc.nextInt();
    
    if(a==b && b==c){
      System.out.println("All numbers are equal");
    }
    else if(a!=b && b!=c && c!=a){
      System.out.println("All numbers are different" );
    }
    else{
      System.out.println("Neither all are equal or different");
    }
  }
}
      
      
      
      
      
      
      