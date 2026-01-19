
// Review Lab_Task-07;

public class review_lab_Task_07{ 
  public static void main(String[]args){
    int arr[] = {6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};
    System.out.println("Prime Numbers:");
    
    for(int i=0; i<arr.length; i++){       //For printing the prime numbers;
      int divcount=0;
      
      for(int j=1; j<=arr[i]; j++){
        if(arr[i]%j==0){
          divcount++;
        }
      }
      if(divcount==2){
        System.out.println(i+": "+arr[i]);
      }
    }
    System.out.println("\nPerfect Numbers:");
    
    for(int i=0; i<arr.length; i++){             //For printing the perfect Numbers;
      int sum=0;
      for(int j=1; j<arr[i]; j++){
        if(arr[i]%j==0){
          sum+=j;
        }
      }
      if(sum==arr[i]){
        System.out.println(i+": "+arr[i]);
      }
    }
  }
}
      
    
    
    
    
    
    
    
    
    
    
          