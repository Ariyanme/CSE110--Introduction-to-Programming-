
// Review Lab_Task-04;

public class review_lab_Task_04{ 
  
  public static boolean isHappyNumber(int a){
    int count=0; 
    
    while(true){
      int sum=0;
      while(a!=0){
        int LD=a%10;
        sum+=LD*LD;
        a=a/10;
      }
      count++;
      a=sum;
      if(sum==1){
        return true;
      }
      if(count>=50){    // 50 times should be enough to check if a number is happy or not;
        return false;
      }
    }
  }
  
  public static void main(String[]args){
    boolean check = isHappyNumber(79);
      System.out.println(check);
  }
}



        
        
        
        
        
        
        
        
        