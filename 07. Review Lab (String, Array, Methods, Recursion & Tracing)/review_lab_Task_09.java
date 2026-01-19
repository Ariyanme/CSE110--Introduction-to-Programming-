
// Review Lab_Task-09;

public class review_lab_Task_09{ 
  
  public static void getScores(char c[], int a[]){
    
    for(int i=0; i<c.length; i++){
      if(c[i]=='A'){
        a[i]=100;
      }
      else if(c[i]=='B'){
        a[i]=90;
      }
      else if(c[i]=='C'){
        a[i]=70;
      }
      else{
        a[i]=0;
      }
    }
    System.out.println("Their Scores based on corresponding Grades:");
    
    for(int i=0; i<a.length; i++){             //For printing the scores stored in the array a;
      System.out.println(a[i]);
    }
  }
  
  public static void main(String[]args){
    char[] studentGrades = new char[]{'B', 'A', 'X', 'B', 'A', 'C', 'B'};
    int[] studentScores = new int[7];
    getScores(studentGrades, studentScores);
  }
}


