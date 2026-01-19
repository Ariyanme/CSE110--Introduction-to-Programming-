
// Review Lab_Task-10;

import java.util.Scanner;
public class review_lab_Task_10{
                                      //A
  public static double convertToCm(double a){
    double cm=a*2.54;
    return cm;
  }
  
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    
    double t = convertToCm(16);
    System.out.println(t + " cm");
    
    double cheetos_inches[]=new double[5];
    for(int i=0; i<cheetos_inches.length; i++){
      cheetos_inches[i]=sc.nextInt();
    }
    double averageLength = findAvgCm(cheetos_inches);                           //Method B call;          
    
    System.out.println("The average Cheeto length is "+ averageLength  +" cm");
    
  }
  
                                     //B
  public static double findAvgCm(double arr[]){
    
    double sum=0;
    for(int i=0; i<arr.length; i++){
      sum+=arr[i];
    }
    double avg=sum/arr.length; 
    double avgTocm=convertToCm(avg);       //Method A call for converting inches to c.m;
    return avgTocm;
  }
  
      
      
}




  
 
  