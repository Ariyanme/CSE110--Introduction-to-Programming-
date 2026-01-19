//0, -7, 14, -21, 28, -35, 42, -49

public class for_loop_series{
  public static void main(String [] args){
    for(int num=0;num<=49&& num>=-49;num-=7){
      if(num==-49){
        System.out.println(num+".");
      }
      else if(num%2==0){
        System.out.print(-1*num +",");
      }
      else if(num%2!=0){
        System.out.print(num+",");
      }

      }
      
    }
  }
