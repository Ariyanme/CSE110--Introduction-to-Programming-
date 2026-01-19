
// {2,0,3,0,8,0,0}
// {2,3,8,0,0,0,0}

public class practice_0001{
  public static void main(String[]args){
    int arr[]={2,0,3,0,8,0,0};
    int arr1[]=new int[arr.length];
    
    for(int i=0; i<arr.length-1; i++){               // first we need to sort the Arrays: {0,0,0,0,2,3,8};
      for(int j=0; j<arr.length-i-1; j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println("Sorted Array: ");
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
    }
    int index=0;
    for(int i=0; i<arr.length; i++){            //Modifying the array by replacing the 0's;
      
      if(arr[i]>0){
        arr1[index]=arr[i];
        index++;
      }
    }
    System.out.println("\n\nModified Array:");             //Printing the new array;
    for(int i=0; i<arr1.length; i++){
      System.out.print(arr1[i]+" ");
    }
  }
}
    