import java.util.Scanner;
public class Homework6
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String pass = input.nextLine();
    boolean hasLower = false;
    boolean hasUpper = false;
    boolean hasNumber = false;
    boolean hasSpecial = false;
    if(pass.length() >= 8)
    {
      for(int i = 0; i < pass.length(); i++)
      {
        int ascii = (int)pass.charAt(i);
        if(ascii >= 65 && ascii <= 90)
        {
          hasUpper = true;
        }
        else if(ascii >= 97 && ascii <= 122)
        {
          hasLower = true;
        }
        else if(ascii >= 30 && ascii <= 39)
        {
          hasNumber = true;
        }
        else
        {
          hasSpecial = true;
        }
      }
    }
    if(hasUpper && hasLower && hasNumber && hasSpecial)
    {
      System.out.print("True");
    }
    else
    {
      System.out.print("False");
    }
  }
}