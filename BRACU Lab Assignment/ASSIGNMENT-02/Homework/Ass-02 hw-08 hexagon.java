class hexagon{
  public static void main(String []args){
    int a=8;
    int b=3;
    int c=a/2;
    double d=Math.sqrt((b*b)+(c*c));
    double area=(((3*Math.sqrt(3))/2)*d*d);  //Here, d= side of the Hexagon
    System.out.println("Area Of The Hexagon: "+area);
    double perimeter=d*6;
    System.out.println("Perimeter of the Hexagon: "+perimeter);
  }
}