package Question;
import java.util.Scanner;
public class Arr8 {
   Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Arr8 ob=new Arr8();
        System.out.println("enter the value ");
        int ar[]=new int [3];
        for(int i=0;i<ar.length;i++){
            ar[i]=ob.sc.nextInt();
        }
        for(int j=0;j<ar.length;j++){
            if(ar[j]==2 && ar[j+1]==3){
                ar[j+1]=0;
                
            }
            System.out.print(ar[j]);
        }
    }
}
