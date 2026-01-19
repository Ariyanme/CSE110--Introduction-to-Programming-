import java.util.Scanner;
public class Homework3a 
{
  public static void main(String[] args)
  {
    double t = calcTax(20, 18000);
    System.out.println(t);
    calcYearlyTax();
    
  }
  public static double calcTax(int age, int salary)
  {
    if(age > 18)
    {
      if( salary >= 10000 && salary <= 20000)
      {
        return salary * 0.07;
      }
      else if(salary > 20000)
      {
        return salary * 0.14;
      }
      else
      {
        return 0;
      }
    }
    else
    {
      return 0;
    }
  }
  public static void calcYearlyTax()
  {
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    int salary;
    double total = 0;
    for(int i = 1; i <= 12; i++)
    {
      salary = sc.nextInt();
      double tax = calcTax(age, salary);
      total += tax;
      System.out.printf("Month%d tax: %.1f\n", i, tax);
    }
    System.out.println("Total Yearly Tax: " + total);
  }
}