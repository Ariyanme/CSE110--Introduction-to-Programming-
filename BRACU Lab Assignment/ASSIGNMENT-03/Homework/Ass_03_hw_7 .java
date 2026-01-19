import java.util.Scanner;
public class Ass_03_hw_7 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka): "); 
    int bill=sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka): "); 
    int paid=sc.nextInt();
    int dif=paid-bill;
    if(dif>0){
      System.out.println("The returned amount is " +dif +" taka");
      int note100=dif/100;
      System.out.println("100 taka note: " +note100);
      int note50=(dif%100)/50;
      System.out.println("50 taka note: " +note50);
      int note20=(dif%50)/20;
      System.out.println("20 taka note: " +note20);
      int note10=(dif%20)/10;
      System.out.println("10 taka note: " +note10);
      int coin5=(dif%10)/5;
      System.out.println("5 taka coin: " +coin5);
      int coin2=(dif%5)/2;
      System.out.println("2 taka coin: " +coin2);
      int coin1=((dif%5)%2)/1;
      System.out.println("1 taka coin: " +coin1);
    }
    else if(dif<0){
      System.out.println("Please pay "+ (-1)*dif+" taka more");
    }
    else{
      System.out.println("The returned amount is 0 taka");
    }
  }
}
    
        
     
        
        
        
        
        
        
        