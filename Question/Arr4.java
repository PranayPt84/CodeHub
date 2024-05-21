package Question;
import java.util.Scanner;
public class Arr4 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 10 values");
        int ar[]=new int [10];
        int ar2[]=new int [10];
        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();}
        int k=0;
        System.out.println("----------------------------");
        for(int i=ar.length-1;i>=0;i--){
        ar2[k]=ar[i];
           
            k++;
            
        }
       for(int i=0;i<ar2.length;i++){
           System.out.println(ar2[i]);
       }
        
    }
}
