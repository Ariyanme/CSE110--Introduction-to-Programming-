
import java.util.Scanner;
public class pat_01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Length:");
    int l=sc.nextInt();
    System.out.print("Width:");
    int w=sc.nextInt();
    for(int i=1;i<=w;i++){
      for(int j=l;j>=1;j--){
        System.out.print(j+" ");
      }
      System.out.println();
    }
  }
}

      
      
      
      
      
      