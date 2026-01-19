/*a program that generates five questions and, after a student answers all five, reports the             
number of correct answers. The program also displays the time spent on the test and lists 
all the questions. */

import java.util.Scanner;
public class Quiz_Java_All_in_One{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("How many questions would you like to test yourself with?");
    int qs=sc.nextInt();
    long start=System.currentTimeMillis();
    int qscount=0;                            //qsn number counter;
    int correct=0, error=0;              //Total correct/wrong answer counter;
    String output=" ";
    
    while(qscount<qs){
      int num1=(int)(Math.random()*11);        //To take 02 random numbers;
      int num2=(int)(Math.random()*11);
      
      if(num1<num2){
        int temp=num1;                      // to avoid a negative outcome we must ensure
        num1=num2;
        num2=temp;                         // that num1>num2
      }
      System.out.println("What is "+num1+"-"+num2+" ?");
      int ans=sc.nextInt();
      
      if(num1-num2==ans){
        System.out.println("Correct! The answer is "+(num1-num2));
        correct++;
      }
      else{
          System.out.println("Wrong answer!\n"+num1+"-"+num2+" should be "+(num1-num2));
          error++;
      }
      qscount++;                //Used Ternary Operator to print the answer script output:
      
      output+= "\n"+num1+"-"+num2+"="+ans+((num1-num2==ans)? " Correct" : " Wrong");
    }
    long end=System.currentTimeMillis();
    long testTime=(end-start)/1000;
    System.out.println("\nTotal Correct answer:"+correct);
    System.out.println("Total Wrong answer:"+error);
    System.out.println("Test time is "+testTime+" seconds");
    System.out.println("\nYour Answer Script is below:"+output);
  }
}


          
                             
                             
        
      
    
    
    
    
    
    
    