package Question;
import java.util.Scanner;
public class Ques3 { 
    
 public static void main(String args[])   {
     Ques3 ob=new Ques3();
     Scanner sc =new Scanner(System.in);
     System.out.println(" Enter a number ");
     int a=sc.nextInt();
     if(a>0&&a<100000){
         System.out.println("Positive number");
     }
     else if(a==0)
     {
         System.out.println("Number zero");
     }
     else if(a<0){
         System.out.println("Negative and Small number");
     }
 }
}
