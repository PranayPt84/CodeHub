package Ques;
import java.util.Scanner;
public class Ques8 {
  void meth1(int a,int b){
      for(int i=1;i<=b;i++)
              {
          System.out.println(a+"*"+i+"="+a*i);
         
      }
      
  }
      public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          Ques8 ob=new Ques8();
          System.out.println("Please enter the number");
          int a=sc.nextInt();
          System.out.println("Input number of times");
           int b=sc.nextInt();
          ob.meth1(a,b);
      }     
}
