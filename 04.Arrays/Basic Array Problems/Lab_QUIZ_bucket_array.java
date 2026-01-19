/*
    Question:

    A teacher wants to evaluate the performance of students based on their marks. 
    Instead of calculating the average marks for the entire section, 
    the teacher is interested in finding the maximum average marks for the entire section, 
    the teacher is interested in finding the maximum average marks among some groups of k consecutive students. 
    Given an array of student's marks and a value k, write a Java program that calculates and prints 
    the maximum average among groups of k consecutive student's marks. You code should work for any given array of positive integers.

    [NOTE: You can assume the value of k will always be less than the length of the array]

    Sample Input 1:
    int[] marks = { 12, 15, 20, 17, 20, 13 };
    Enter value of k: 4

    Explanation:
        (12 + 15 + 20 + 17) / 4 = 16.0
        (15 + 20 + 17 + 20) / 4 = 18.0
        (20 + 17 + 20 + 13) / 4 = 17.5
        Among 16.0, 18.0 and 17.5, 18.0 is the maximum average.

    Sample Output 1:
    Max Avg:
    18.0

    Sample Input 2:
    int[] marks = { 13, 11, 19, 17, 16, 15, 18, 11 };
    Enter value of k: 7

    Explanation:
        (13 + 11 + 19 + 17 + 16 + 15 + 18) / 7 = 15.57
        (11 + 19 + 17 + 16 + 15 + 18 + 11) / 7 = 15.28
        Among 15.57 and 15.28, 15.57 is the maximum average.

    Sample Output 2:
    Max Avg:
    15.57
*/



import java.util.Scanner;
public class bucket_array{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    //int[] marks = { 12, 15, 20, 17, 20, 13 };
    int[] marks = { 13, 11, 19, 17, 16, 15, 18, 11 };
    System.out.println("Enter value of k: ");
    int k=sc.nextInt();
    if(k>marks.length){
      System.out.println("Error: Number of students in a group cannot exceed the total number of students in the class.");
    }
    else{
      float max=0;
      for(int i=0; i<marks.length; i++){
        float sum=0;
        int count=0;                            // Counter for taking K elements in the bucket;
        
        for(int j=i; j<marks.length; j++){
          if(count!=k){
            sum+=marks[j];
            count++;
          }
          else{
            break;
          }
        }
        float average=sum/k;
        if(average>max){
          max=average;
        }
      }
      System.out.println("Maximum Average: "+max);
    }
  }
}

      
        
