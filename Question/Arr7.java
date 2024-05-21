package Question;
import java.util.Scanner;
public class Arr7 {
    Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
          Arr7 ob=new Arr7();
        System.out.println("Enter the values ");
        int arr[]=new int [10];
        for(int i=0;i<arr.length;i++){
            arr[i]=ob.sc.nextInt();
            
        }
            int a=0,b=arr[0];
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
            if(arr[j]>a){
                a=arr[j];
            }
            if(arr[j]<b){
                b=arr[j];
            }
            
        }
        System.out.println("-------------------");
        System.out.println("HIGHEST NUMBER ="+a);
        System.out.println("SMALLEST NUMBER ="+b);
    }
}
