package Question;
import java.util.Scanner;
public class Arr6 {
Scanner sc=new Scanner (System.in); 
    public static void main(String[] args) {
        Arr6 ob=new Arr6();
        int arr[][]= new int [3][3];
        System.out.println("enter the value ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=ob.sc.nextInt();
            }
        }
        for(int k=0;k<3;k++){
            for(int m=0;m<3;m++){
                System.out.print(arr[k][m]);
            }
            System.out.println();
        }
    }
}
