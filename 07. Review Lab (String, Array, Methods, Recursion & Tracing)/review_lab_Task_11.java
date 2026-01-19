
// Review Lab_Task-11;

import java.util.Scanner;
public class review_lab_Task_11{
                                      //A
  
  public static int isVowel(String s){
    int vcount=0;
    for(int i=0; i<s.length(); i++){
      char a=s.charAt(i);
      if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U' || a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
        vcount++;
      }
    }
    return vcount;
  }
  
  public static void main(String[]args){
    String str="The quick brown fox jumps over the lazy dog";
    int vowel=isVowel(str);
    System.out.println("Number of vowels in the string: "+vowel);
    
    int cons=isConsonant(str);
    System.out.println("\nNumber of consonants in the string: "+cons);
    
    String [] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
    System.out.println( "\nThe total number of vowels in the array is:" + vowelSum(names));
    System.out.println( "\nThe total number of consonants in the array is:" + consonantSum(names));
  }
  
                                    //B
  public static int isConsonant(String s){
    int ccount=0;
    for(int i=0; i<s.length(); i++){
      char a=s.charAt(i);
      int ascii=(int)a;
      if((ascii>=65 && ascii<=90) || (ascii>=97 && ascii<=122)){
        if(a=='A' || a=='E' || a=='I' || a=='O' || a=='U' || a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
                                                                                                         
        }                                    //Excluding the vowels;
        else{
          ccount++;
        }
      }
    }
    return ccount;
  }
                                            //C
  
  public static int vowelSum(String s1[]){
    int vsum=0;
    for(int i=0; i<s1.length; i++){
      vsum= vsum + isVowel(s1[i]);           //calling method A;
    }
    return vsum;
  }
  
  public static int consonantSum(String s1[]){
    int csum=0;
    for(int i=0; i<s1.length; i++){
      csum= csum + isConsonant(s1[i]);           //calling method B;
    }
    return csum;
  }
}


  