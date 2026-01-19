import java.util.Scanner;
public class ex122{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number:");
    int m=sc.nextInt();
    int count=0;                                   //will divide the number by starting from 1 to the num itself 
    for(int i=1;i<=m;i++){                    // and check if it has only 2 div or not!               
      if(m%i==0){            
        count++;                           //Counting the number of divisors;
      }
    }
    if(count==2){                       //bcz prime num has only 02 divisors(1 & itself);
      System.out.println(m+" is a prime number");
    }
    else{
      System.out.println("Regular Number bcz it has "+count+" divisors");
    }
  }
}
