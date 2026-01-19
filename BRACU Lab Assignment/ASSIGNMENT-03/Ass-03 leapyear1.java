import java.util.Scanner;
public class leapyear1{
  public static void main(String args []){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a YEAR: ");
    int year = sc.nextInt();
    if(year%4==0 && year%100!=0){
      System.out.println(year+" is a LeapYear");
    }
    else if(year%100==0){
      if(year%400==0){
        System.out.println(year+" is a LeapYear");
      }else{
        System.out.println(year+" is a CENTURY Year");
      }
    }
    else{
      System.out.println(year+" is not a LeapYear");
    }
  }
}