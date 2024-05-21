package Question;
import java.util.Scanner;
public class Arr10 {
    Scanner sc=new Scanner(System.in);
    int[] meth1(){
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }
   public static void main(String args[]){
       Arr10 ob=new Arr10();
       System.out.println("enter the value");
       int result[]=ob.meth1();
       System.out.println("------------------");
       for(int x:result){
           System.out.println(x);
       }
   }
      
    
}
