package Question;
import java.util.*;
public class Arr2 {
public static void main (String arr[]){
    System.out.println("PLese enter the 10 values for arr");
    Scanner sc= new Scanner(System.in);
    int ar[]=new int [10];
    for (int i=0;i<10;i++){
        ar[i]=sc.nextInt();
      
    }  System.out.println("--------------------------------------");
 
    for (int j=0;j<10;j++){
        System.out.println(ar[j]);
    }
    System.out.println("--------------------------------------");
    System.out.println("enter the number ");
    int a=sc.nextInt();
      System.out.println("--------------------------------------");
 
    for(int k=0;k<10;k++){
      if(ar[k]==a){
          System.out.println(ar[k]);
       }
         
      }
    
    }
}    

