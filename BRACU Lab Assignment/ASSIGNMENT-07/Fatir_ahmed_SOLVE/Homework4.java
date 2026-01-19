import java.util.Scanner;
public class Homework4
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String phrase = input.nextLine();
    int count = 1;
    for(int i = 0; i < phrase.length(); i++)
    {
      char c = phrase.charAt(i);
      if((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
      {
        if(count % 2 != 0)
        {
          if(c >= 65 && c <= 90)
          {
            System.out.print((char)(c + 32));
            count++;
            continue;
          }
          else if(c >= 97 && c <= 122)
          {
            System.out.print(c);
            count++;
            continue;
          }
        }
        if(count % 2 == 0)
        {
          if(c >= 65 && c <= 90)
          {
            System.out.print(c);
            count++;
            continue;
          }
          else if(c >= 97 && c <= 122)
          {
            System.out.print((char)(c - 32));
            count++;
            continue;
          }
        }
      }
      else
      {
        System.out.print(c);
      }
    }
  }
}