    package Ques;
    import java.util.Scanner;
 public class Ques7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter five numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int sum=a+b+c+d+e;
        float avg=(float)sum/5;
        System.out.println("the sum of all number =>"+sum);
        System.out.println("And Avrage of all number is =>"+avg);
        
        
    }
}
