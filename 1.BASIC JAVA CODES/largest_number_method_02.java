import java.util.Scanner;
public class largest_number_method_02 {
  public static void main (String []args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a: ");
    int a= sc.nextInt();
    System.out.println("Enter b: ");
    int b= sc.nextInt();
    System.out.println("Enter c: ");
    int c= sc.nextInt();
    int largest=a;
    if(b>largest){
      largest=b;
    }
    if (c>largest){
      largest=c;
    }
    System.out.println("Largest number is: " + largest);
  }
}
