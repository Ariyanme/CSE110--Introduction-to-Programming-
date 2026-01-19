import java.util.Scanner;
public class Homework3
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String str1 = input.nextLine();
    String str2 = input.nextLine();
    String conct = str1+str2;
    for(int i = 0; i < conct.length(); i++)
    {
      boolean unique = true;
      for(int j = 0; j < conct.length(); j++)
      {
        if(conct.charAt(i) == conct.charAt(j) && i != j)
        {
          unique = false;
          break;
        }
      }
      if(unique)
      {
        System.out.print((char)(conct.charAt(i) - 32));
      }
    }
  }
}