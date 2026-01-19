import java.util.Scanner;
public class Homework4
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    oneToN(1, n);
  }
  public static void oneToN(int first, int last)
  {
    if(first > last)
    {
      return;
    }
    else
    {
      System.out.print(first + " ");
      oneToN(first + 1, last);
    }
  }
}