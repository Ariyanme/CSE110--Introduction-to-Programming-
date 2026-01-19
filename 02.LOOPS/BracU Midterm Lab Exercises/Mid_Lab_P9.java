// Midterm_Lab_Exercises_Problem-09

import java.util.Scanner;
public class Mid_Lab_P9{
  public static void main(String args[]) {
   Scanner sc=new Scanner (System.in);
   System.out.println("Number of Test Cases: ");
   int n=sc.nextInt();
   for(int i=1; i<=n; i++){
     int x=sc.nextInt();
     int y=sc.nextInt();
     
     if(x>y){
       int temp=x;         //In case x>y
       x=y;
       y=temp;
     }
     int sum=0;
     for(int j=x+1; j<y; j++){
       if(j%2!=0){
         sum+=j;
       }
     }
     System.out.println(sum);
   }
  }
}
