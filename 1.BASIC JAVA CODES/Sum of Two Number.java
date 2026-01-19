 import java.util.Scanner;
class Sum_of_two_integer {
  public static void main (String [] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int a= sc.nextInt();
    System.out.println("Enter another integer: ");
    int b= sc.nextInt();
    int sum= a+b;
    System.out.println("Output: " + sum);
  }
}