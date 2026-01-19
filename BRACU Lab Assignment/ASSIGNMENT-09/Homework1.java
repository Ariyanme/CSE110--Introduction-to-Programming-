public class Homework1
{
  public static void main(String[] args)
  {
    boolean check = isPrime(7);
    System.out.println(check);
    check = isPerfect(6);
    System.out.println(check);
    int result = special_sum(8);
    System.out.println(result);
  }
  public static boolean isPrime(int n)
  {
    for(int i = 2; i <= n / 2; i++)
    {
      if(n % i == 0)
      {
        return false;
      }
    }
    return true;
  }
  public static boolean isPerfect(int n)
  {
    int sum = 0;
    for(int i = 1; i < n / 2 + 1; i++)
    {
      if(n % i == 0)
      {
        sum += i;
      }
    }
    if(sum == n)
    {
      return true;
    }
    else
    {
      return false;
    }
  }
  public static int special_sum(int n)
  {
    int sum = 0;
    for(int i = 2; i < n; i++)
    {
      if(isPerfect(i) || isPrime(i))
      {
        sum += i;
      }
    }
    return sum;
  }
}