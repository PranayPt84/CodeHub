package Question;
import java.util.Scanner;
public class Arr11 {
    Scanner sc=new Scanner (System.in);
        boolean meth1(){
          int arr[]=new int[2];
            System.out.println("enter two number");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
        }
         for(int j=0;j<arr.length;j++){
             System.out.println(arr[j]);
             if(arr[j]==2||arr[j]==3){
               return false;  
             }
         }
         return true;
        }
    public static void main(String[] args) {
        Arr11 ob=new Arr11();
        boolean a=ob.meth1();
        System.out.println(a);
        
    }
        
    }

