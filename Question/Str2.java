package Question;
import java.util.Scanner;
public class Str2 {
        Scanner sc= new Scanner(System.in);
    void meth1(){
        System.out.println("Enter your full name");
        String a1=sc.next();
        System.out.println(" WELL-COME "+a1);
        System.out.println();
        System.out.println(a1+" please log-in your id");
        System.out.println("-----------------------------");
    }
    void meth2(){
         String a=" WELL-COME ";
         System.out.println("ENTER YOUR FULL NAME");
         String a1=sc.next();
        
         System.out.println(a.concat(a1));
         System.out.println();
         System.out.println(a1.concat(" please log-in your id "));
    }
    public static void main(String[] args) {
        Str2 aobj=new Str2();
        aobj.meth1();
        aobj.meth2();
    }
}
