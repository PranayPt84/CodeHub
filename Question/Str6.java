package Question;
import java.util.Scanner;
public class Str6 {
    String st(String a1){
        if(a1.length()>=2)
        return a1.substring(0, 2);
       else
            return a1;
      }   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Str6 ob=new Str6();
        String output=ob.st(sc.next());
        System.out.println(output);
    }
}
