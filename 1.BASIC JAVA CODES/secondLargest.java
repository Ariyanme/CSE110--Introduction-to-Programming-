import java.util.Scanner;
public class secondLargest {
  public static void main(String[]args){
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the valuae of a: ");
    int a=sc.nextInt();
    System.out.println("Enter the valuae of b: ");
    int b=sc.nextInt();
    System.out.println("Enter the valuae of c: ");
    int c=sc.nextInt();
    int max=Math.max(Math.max(a,b),c);
    int secondlargest=Integer.MIN_VALUE;
    if(a!=max ){
       secondlargest= Math.max(a,secondlargest);
    }
    if(b!=max ){
       secondlargest= Math.max(b,secondlargest);
    }
    if(c!= max ){
       secondlargest= Math.max(c,secondlargest);
    }
    System.out.println("The Second Largest Number is: " + secondlargest);
  }
}