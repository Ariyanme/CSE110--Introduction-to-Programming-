import java.util.Scanner;
class Trigonmetry1 {
  public static void main (String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a: ");
    double a=sc.nextDouble();
    System.out.println("Enter b: ");
    double b=sc.nextDouble();
    
    double c=Math.sqrt((a*a)+(b*b));  //OR, c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    
    double sinA=a/c;
    double cosA=b/c;
    double sinB=b/c;
    double cosB=a/c;
    System.out.println("sinA= "+sinA);
    System.out.println("cosA= "+cosA);
    System.out.println("sinB= "+sinB);
    System.out.println("cosB= "+cosB);
  }
}
    
    