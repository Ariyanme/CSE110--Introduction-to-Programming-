import java.util.Scanner;
class abc1 {
  public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Name,Roll,Marks,Grade");
    
    String Name=sc.nextLine();
    int Roll= sc.nextInt();
    double Marks= sc.nextDouble();
    char Grade= sc.next().charAt(0);
    
    System.out.println("Name: "+Name);
    System.out.println("Roll no.: "+ Roll);
    System.out.println("Marks: " + Marks);
    System.out.println("Grade: " + Grade);
  }
}