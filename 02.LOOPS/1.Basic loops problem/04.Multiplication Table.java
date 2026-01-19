import java.util.Scanner;
public class ex11{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter m:");
    int m=sc.nextInt();
    System.out.print("Enter n:");
    int n=sc.nextInt();
    System.out.println("\nMultiplication table of "+m+" to "+n+" is given below: \n");
    int product=1;
    for(int i=m;i<=n;i++){
      for(int j=1;j<=10;j++){
        product=i*j;
        System.out.println(i+"x"+j+"="+product);
      }
      System.out.println();
    }
  }
}

        
        
    
    