import java.util.Scanner;
public class Ass_03_hw_5 {
  public static void main(String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Age: ");
    int age=sc.nextInt();
    System.out.println("Payment: ");
    int pay=sc.nextInt();
    if(age>=18){
      if(pay<10000){
        System.out.println("Your tax amount is 0 Tk");
      }
      else if(pay>=10000 && pay<=20000){
        int tax=(pay*5)/100;
        System.out.println("Your tax amount is " +tax+" Tk");
      }
      else if(pay>20000){
        int tax=(pay*10)/100;
        System.out.println("Your tax amount is " +tax +" Tk");
      }
    }
    else{
      System.out.println("NO TAX IF YOU ARE LESS THAN 18 YEARS OLD.");
    }
  }
}
        
        
        
        
        
              
              
              
              
              
