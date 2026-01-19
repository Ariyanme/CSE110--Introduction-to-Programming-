import java.util.Scanner;
class MinutesTOyears {
  public static void main (String []args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter total Minutes: ");
    int minutes=sc.nextInt();
    int year=minutes/525600;
    int days=(minutes%525600)/1440;
    System.out.println("3456789 minutes is approximately "+year+"Years and " +days +"days");
  }
}
    