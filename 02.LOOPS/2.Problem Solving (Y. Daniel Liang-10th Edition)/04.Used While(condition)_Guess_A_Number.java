/*The problem is to guess what number a computer has in mind. You will write a program that 
randomly generates an integer between 0 and 100, inclusive. The program prompts the user 
to enter a number continuously until the number matches the randomly generated number. For 
each user input, the program tells the user whether the input is too low or too high, so the user 
can make the next guess intelligently.*/

import java.util.Scanner;
public class Guess_A_Number{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int random=(int)(Math.random()*101);
    System.out.println(random);        //Just to lessen the hardwork;haha,try to ignore though;
    System.out.print("Guess a magic Number between 1-100:");
    int guess=sc.nextInt();
    while(guess!=random){              //if guess==random, the loops terminates!
      if(guess>random){
        System.out.println("Your guess is too high");
      }
      else if(guess<random){
        System.out.println("Your guess is too low");
      }                             
      System.out.print("Try again");
      guess=sc.nextInt();
    }
     System.out.println("Bingo!You're a genius!The number is "+random);  
  }
}
      
    
    
    
    
    
    
    