import java.util.Scanner;
public class second_smallest_number {
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the valuae of a: ");
    int a=sc.nextInt();
    System.out.println("Enter the valuae of b: ");
    int b=sc.nextInt();
    System.out.println("Enter the valuae of c: ");
    int c=sc.nextInt();
    int min=Math.min(Math.min(a,b),c);
    int secondsmallest=Integer.MAX_VALUE;
    if(a!=min ){
       secondsmallest= Math.min(a,secondsmallest);
    }
    if(b!=min ){
      secondsmallest= Math.min(b,secondsmallest);
    }
    if(c!= min ){
       secondsmallest= Math.min(c,secondsmallest);
    }
    System.out.println("The Second Smallest Number is: " + secondsmallest);
  }
}