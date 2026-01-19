import java.util.Scanner;
public class largest_number {
  public static void main (String []args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a: ");
    int a= sc.nextInt();
    System.out.println("Enter b: ");
    int b= sc.nextInt();
    System.out.println("Enter c: ");
    int c= sc.nextInt();
    int max=Math.max(Math.max(a,b),c);
    System.out.println("The largest number is: " +max);
  }
}
    