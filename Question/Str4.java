package Question;
import java.util.Scanner;
public class Str4 {
  String makeoutword(String out,String word){
 return out.substring(0, 2).concat(word).concat(out.substring(2));
}
  public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      System.out.println("Plese enter the String");
      Str4 obj=new Str4();
      String output=obj.makeoutword("<<>>",sc.next());
      System.out.println(output);
  }
}