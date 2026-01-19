//Homework-04 from Lab_Assignment_Spring_2024;


import java.util.Scanner;
public class Elements_addition_for_acheiving_the_target_Value {
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the length of the Array:");
    int n=sc.nextInt();
    System.out.println("Please enter the elements of the array:");
    int arr[]=new int[n];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Please enter the target value: ");
    int target=sc.nextInt();
    System.out.println("Original Array: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    boolean flag=false;
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){                //i!=j bcz index can't be same, otherwise doesn't work for case02;
        if(arr[i]+arr[j]==target && i!=j){
          System.out.println("\nElements need to be added: "+arr[i]+" and "+arr[j]);
          System.out.println("Index of the elements: "+i+" and "+j);
          flag=true;
          break;                                    //If elements are found no further checking is needed;
        }
      }
      if(flag){
        break;                                     // if found the flag turns true and the whole operations stops as we found our expected results;
      }
    }
    if(!flag){
      System.out.println("\nTarget value not found");
    }
  }
}
