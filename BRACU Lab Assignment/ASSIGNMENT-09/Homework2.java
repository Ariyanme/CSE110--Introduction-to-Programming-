public class Homework2
{
  public static void main(String[] args)
  {
    showDots(5);
    show_palindrome(5);
    showDiamond(100);
  }
  public static void showDots(int n)
  {
    for(int i = 0; i < n; i++)
    {
      System.out.print(".");
    }
  }
  public static void show_palindrome(int n)
  {
    for(int i = 1; i <= n; i++)
    {
      System.out.print(i);
    }
    for(int i = n - 1; i >= 1; i--)
    {
      System.out.print(i);
    }
  }
  public static void showDiamond(int n)
  {
    for(int i = 1; i < n*2; i++)
    {
      if(i <= n)
      {
        showDots(n - i);
        show_palindrome(i);
        showDots(n - i);
        System.out.println();
      }
      else
      {
        int x = n * 2 - i;
        showDots(n - x);
        show_palindrome(x);
        showDots(n - x);
        System.out.println();
      }
    }
  }
}