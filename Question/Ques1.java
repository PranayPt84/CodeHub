package Question;
import java.util.Scanner;
public class Ques1 {
    Scanner sc=new Scanner(System.in);
void meth1(){
  Ques1 ob =new Ques1();
  System.out.print("Please  enter the number  =>");
 int i= ob.sc.nextInt();
 if (i>0){
     System.out.println(i+" is Positive Number");
     
 }
 else if(i==0){
  System.out.println(i+" NUmber is Zero");
 }
 else{
     System.out.println(i+" Negative Number");
 }
    
}   
public static void main (String args[]){
    Ques1 ob =new Ques1();
    ob.meth1();
}
}
