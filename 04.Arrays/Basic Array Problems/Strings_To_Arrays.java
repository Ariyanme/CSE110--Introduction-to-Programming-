
// Convert a String to an Array;
// "Bob, Carrol, Alicee, Trudy" = [Bob, Carrol, Alice, Trudy]

import java.util.Arrays;
import java.util.Scanner;
public class Strings_To_Arrays{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    int count=0;
    for(int i=0; i<s1.length(); i++){
      if(s1.charAt(i)==','){
        count++;
      }
    }
    String [] array=new String[count+1];        //length of the array will be 1 more than the number of commas;
    String empty="";
    int index=0;
    for(int i=0; i<s1.length(); i++){
      char x=s1.charAt(i);
      if(x==','){
        array[index]=empty;
        index++;
        empty="";
      }
      else{
        empty+=x;
      }
    }
    array[index]=empty;                             //Stores the remaining portion of the String without Comma in the Array;
    System.out.println(Arrays.toString(array));
  }
}