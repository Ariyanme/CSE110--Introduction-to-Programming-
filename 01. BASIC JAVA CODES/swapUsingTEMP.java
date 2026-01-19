class swapUsingTEMP{
  public static void main(String []args) {
    int num1=60;
    int num2=70;
    System.out.println("Numbers before swapping: ");
    System.out.println("Num1= "+num1);
    System.out.println("Num2= "+ num2);
    int temp= num1;
    num1=num2;
    num2=temp;
    System.out.println("After Swapping: ");
    System.out.println("Num1= " + num1);
    System.out.println("Num2= "+ num2);
  }
}