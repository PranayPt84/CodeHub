package Question;
import java.util.Scanner;
public class Ques5 {
    Scanner sc=new Scanner(System.in);
    void meth1(){
        Ques5 ob=new Ques5();
        System.out.println("Please enter the number");
      int a=  ob.sc.nextInt();
      int b=0;
      int k=0;
      
        for(int i=1;i<=a;i++)
        {
            System.out.println(i);
             b=b +i;
        }
        int c=10*a+b;
        System.out.println("....................");
        for(int j=1;j<=c;j++){
            System.out.println(j);
            k=k+j;
        }
        System.out.println("Sum of the number is=> "+ k);
    }
 public static void main(String args[]){
       Ques5 ob=new Ques5();
       ob.meth1();
}
}
