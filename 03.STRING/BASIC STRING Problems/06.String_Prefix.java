
// print the Prefix from 03 String along with it's length;     //apple, apparent, appeal; Prefix="app"

import java.util.Scanner;
public class String_Prefix {
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    String s3=sc.nextLine();
    String s4="";
    int count=0;
    for(int i=0; i<s1.length(); i++){
      for(int j=0; j<s2.length(); j++){
        for(int k=0; k<s3.length(); k++){
          char a=s1.charAt(i);
          char b=s2.charAt(j);
          char c=s3.charAt(k);
          if(a==b && a==c){
            s4+=a;
            i++;
            j++;
            count++;
          }
          else{
            break;                //To prevent the outer for loop running more than once; most inner for loop does all the work;
          }
        }
      }
      break;                             //No need to reverse this time as it is already straight forward from the beginning;
    }
    System.out.println("Prefix: "+s4);
    System.out.println("Length: "+count);
  }
}
    
    
    
    
    
    
    
    
        
        
        
        
        
        
        
        
        