
// you've to create an array on the given length; then you have to find the minimum element from the array and print it with it's index
// You will have to take another value M and find it in the element of the array; 
// If found first print the M values index and then calculate the average of the min & M value and print it;
// If u dont find the M value print "M value not found";


import java.util.Scanner;
public class QuIZ__005{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("N=");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("M=");
    int m=sc.nextInt();
    int min=99999;
    for(int i=0; i<arr.length; i++){
      if(arr[i]<min){
        min=arr[i];
      }
    }
    System.out.println("Min Value: "+min);
    for(int i=0; i<arr.length; i++){
      if(arr[i]==min){
        System.out.println("Min Value index is: "+i);
        break;
      }
    }
    boolean flag=false;
    for(int i=0; i<arr.length; i++){
      if(arr[i]==m){
        System.out.println("M value is at index: "+i);
        double average=(double)(min+m)/2;
        System.out.println("Average: "+average);
        flag=true;
        break;
      }
    }
    if(!flag){
      System.out.println(m+" not found");
    }
  }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    