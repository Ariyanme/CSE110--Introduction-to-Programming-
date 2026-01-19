import java.util.Scanner;
public class Homework7
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String str1 = input.nextLine();
    String str2 = input.nextLine();
    int count = 0;
    for(int i = 0; i < str1.length(); i++)
    {
      for(int j = 0; j < str2.length(); j++)
      {
        if(str1.charAt(i + j) != str2.charAt(j))
        {
          break;
        }
        else if(j == str2.length() - 1)
        {
          count++;
        }
      }
    }
    System.out.printf("Occurrence: %d times", count);
  }
}