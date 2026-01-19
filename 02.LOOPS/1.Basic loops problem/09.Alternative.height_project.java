import java.util.Scanner;
public class quiz2A{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N= ");
    int n = sc.nextInt();
    float max = 0;
    float sum = 0;
    for (int i = 0; i < n; i++){
      float h = sc.nextFloat();
       if (h > max){
        max = h;
      }
      sum += h;
    }
    float avg = sum / n;
    System.out.println("Max height: "+max+"\nAverage Height= "+avg+"\nDifference= "+(max-avg));
  }
}
    