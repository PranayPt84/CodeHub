package Question;
import java.util.Scanner;
public class Arr3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar[]=new int[20];
        System.out.println("enter the 20 values ");
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
          System.out.println("--------------------------------------");
         for(int j=0;j<ar.length;j++){
            System.out.println(ar[j]);
        }
          System.out.println("--------------------------------------");
          int poss=0,neg=0,odd=0,even=0,zero=0;
      for(int k=0;k<ar.length;k++){
          if(ar[k]<0)
               neg++;
         
          else if(ar[k]>0)
              poss++;
          
      
      else if(ar[k]==0)
              zero++;
      if(ar[k]%2==0){
          
         even++;
      }
      else 
              odd++;
              
          }
        System.out.println("Positive number ="+poss);
        System.out.println("nigetive number ="+neg);
        System.out.println("Zeroes number ="+zero);
        System.out.println("Even number ="+even);
        System.out.println("Odd number ="+odd);
    }
    
}
  
