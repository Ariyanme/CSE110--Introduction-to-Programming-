import java.util.Scanner;
public class Homework5
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String str1 = input.nextLine();
    String str2 = input.nextLine();
    for(int i = 0; i < str1.length(); i++)
    {
      char c1 = str1.charAt(i);
      boolean duplicate = false;
      for(int j = 0; j < str2.length(); j++)
      {
        char c2 = str2.charAt(j);
        if(c1 == c2 || c1 == c2 - 32 || c1 == c2 + 32)
        {
          duplicate = true;
          break;
        }
      }
      if(!duplicate)
      {
        System.out.print(c1);
      }
    }    
  }
}