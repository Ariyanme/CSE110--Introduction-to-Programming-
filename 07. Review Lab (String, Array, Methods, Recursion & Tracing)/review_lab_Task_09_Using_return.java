
//Review lab_Task-09;

// Solving using return;

public class review_lab_Task_09_MOD{ 
  
  public static int[] getScores(char c[], int a[]){    // int[] to return an ARRAY;
    
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
    return a;         //Returning the Array;

  }
  
  public static void main(String[]args){
    char studentGrades [] = {'B', 'A', 'X', 'B', 'A', 'C', 'B'};
    int studentScores [] = new int[7];
    
    int scores[]= getScores(studentGrades, studentScores);
    System.out.println("Their Scores based on corresponding Grades:");
    
    for(int i=0; i<scores.length; i++){             //For printing the scores stored in the array scores;
      System.out.println(scores[i]);
    }
  }
}


