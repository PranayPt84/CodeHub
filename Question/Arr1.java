package Question;
import java.util.Scanner;
public class Arr1 {
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    
    
    int vi[]=new int[10];
    for(int i=0;i<10;i++){
       System.out.println("Eneter the value ");
       vi[i]=sc.nextInt();
    }
    for(int j=0;j<10;j++)
    {
        System.out.println(vi[j]);
    }
}    
}
