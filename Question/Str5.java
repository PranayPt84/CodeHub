package Question;
import java.util.Scanner;
public class Str5 {
    String out(String a1){
        return a1.substring(a1.length()-2)+ a1.substring(a1.length()-2)+ a1.substring(a1.length()-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Str5 ob=new Str5();
        System.out.println("plese enter the string");
        String output=ob.out(sc.next());
        System.out.println(output);
    }
}
