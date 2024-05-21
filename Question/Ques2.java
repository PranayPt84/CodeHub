package Question;
import java.util.Scanner;
public class Ques2 {
    Scanner sc=new Scanner(System.in);
void meth1()
{
    Ques2 ob=new Ques2();
    System.out.println("Please enter three number");
    int a=ob.sc.nextInt();
    int b=ob.sc.nextInt();
    int c=ob.sc.nextInt();
    if(a>b &&a>c){
        System.out.println(a+" is the Greatest number");
    }
    else if(b>a&&b>c)
    {
        System.out.println(b+ " is Greatest number");
    }
    else if (c>a&&c>b){
        System.out.println(c+" is Greatest number");
    }
    else{
        System.out.println("All numbers are equal");
    }
}
public static void main(String args[]){
    
    Ques2 ob=new Ques2();
    ob.meth1();
    
}
}

