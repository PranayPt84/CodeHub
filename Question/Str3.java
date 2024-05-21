package Question;
import java.util.Scanner;
public class Str3 {
    Scanner sc=new Scanner (System.in);
    void meth1(){
        System.out.println("PLese enter two strings");
        String a1=sc.next();
        String a2=sc.next();
        System.out.println(a1.concat(a2.concat(a2.concat(a1))));
        
    }
    public static void main(String args[]){
       Str3 ob =new Str3();
       ob.meth1();
    }
}
