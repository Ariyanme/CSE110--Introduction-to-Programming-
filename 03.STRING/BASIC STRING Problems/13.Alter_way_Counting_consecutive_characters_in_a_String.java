
import java.util.Scanner;
public class StringCompression2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1 = sc.nextLine();
    
    char currentChar = s1.charAt(0);
    int count = 1;

    for (int i = 1; i < s1.length(); i++) {
     
      if (s1.charAt(i) == currentChar) {        //Check if current character is same as previous
        count++;
      } 
      else {
                                                     // Print previous character and count
        System.out.print(currentChar + "" + count);   
        
        currentChar = s1.charAt(i);                // Update current character and reset count
        count = 1;
      }
    }

    System.out.print(currentChar + "" + count);    // Print the last character and its count
  }
}