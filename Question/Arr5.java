package Question;
import java.util.Scanner;
public class Arr5 {
    Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
        Arr5 ob=new Arr5();
          int a=0,b=1;
        System.out.println("Enter 10 values ");
        int ar[]=new int[10];
        for(int i=0;i<ar.length;i++){
          ar[i]=ob.sc.nextInt();
           a=a+ar[i];
           b=b*ar[i];
        }
        for(int j=0;j<ar.length;j++){
            System.out.println(ar[j]);
        }
        System.out.println("------------------------");
         System.out.println("Sum of all number is"+a);
         System.out.println("----------------------");
         System.out.println("Product of all number is"+b);
    }
}
