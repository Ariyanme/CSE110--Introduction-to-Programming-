import java.util.Scanner;
public class Ass_03_hw_6 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a: ");    //For Shortcut use: Math.max and Math.min functions!!
    float a=sc.nextFloat();
    System.out.println("Enter b: ");
    float b=sc.nextFloat();
    System.out.println("Enter c: ");
    float c=sc.nextFloat();
    if(a>b && a>c){
      System.out.println("Maximum number is: "+a);
      if(b>c){
        System.out.println("Minimum number is: "+c);
      }
      else{
         System.out.println("Minimum number is: "+b);
      }
    }
    else if(b>c && b>a){
      System.out.println("Maximum number is: "+b);
      if(a>c){
        System.out.println("Minimum number is: "+c);
      }
      else{
        System.out.println("Minimum number is: "+a);
      }
    }
    else{
      System.out.println("Maximum number is: "+c);
      if(a>b){
       System.out.println("Minimum number is: "+b); 
      }
      else{
        System.out.println("Minimum number is: "+a);
      }
    }
  }
}

      
        
        
        
        
        
  
        
        
        
        
        
        
        
        
        