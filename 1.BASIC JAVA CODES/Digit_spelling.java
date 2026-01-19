   /*
     * Digit spelling program using if,else if, else
     * step 1: ask for a digit between 0-9
     * step 2: check the digit and print it by spelling. example if user input is 0 then print Zero
     * step 3: if the digit is not among 0-9 then print Invalid digit
     */
import java.util.Scanner;
public class Digit_spelling {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number between 0-9");
    int num=sc.nextInt();
    if(num>=0 && num<=9){
      if(num==0){
        System.out.println("zero");
      }else if(num==1){
        System.out.println("one");
      }else if(num==2){
        System.out.println("two");
      }else if(num==3){
        System.out.println("Three");
      }else if(num==4){
        System.out.println("Four");
      }else if(num==5){
        System.out.println("Five");
      } else if(num==6){
        System.out.println("Six");
      }else if(num==7){
        System.out.println("Seven");
      }else if(num==8){
        System.out.println("Eight");
      }else if(num==9){
        System.out.println("Nine");
      }
    }
    else{
      System.out.println("Invalid Number");
    }
       }
     }
