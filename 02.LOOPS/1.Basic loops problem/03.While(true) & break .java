import java.util.Scanner;
public class test1001{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter n Number");
    int n=sc.nextInt();
    System.out.println("The odd numbers are: ");
    int sum=0;
    int count=0;
    int i=1;
    while(true){
      if(count==n){
        break;
      }
      else if(i%2!=0){              //Checking if the number is odd or not;
        System.out.println(i);
        sum+=i;
        count++;
      }
        i++;                        //or,or, i<=2*n; i+=2;
    }
    System.out.println("Total odd numbers printed: "+count);
    System.out.println("\nThe sum of "+n+" odd numbers are="+sum);
  }
}

      