public class hw7 {
  public static void main(String[] args){
    double h= (((5*60*60)+(56*60)+23)/3600.0);
    double km=2500.0/1000.0;
    double mile=2500.0/1609.0;
    double x=km/h;
    double y=mile/h;
    System.out.println("Your velocity in km/h is: " +x);
    System.out.println("Your velocity in mile/h is: "+y);
  }
}