package Oops;
import java.util.Scanner;
public class Encaps2b {
    Encaps2a ob=new Encaps2a();
    Scanner sc=new Scanner(System.in);
    void Account(){
        System.out.println("Please enter Account number ");
        ob.setAcc_no(sc.nextLong());
        System.out.println("PLease enter Your Name ");
        ob.setName(sc.next());
        System.out.println("Please enter your E-mail");
        ob.setE_mail(sc.next());
        System.out.println("Please enter  bank Amount ");
        ob.setAmmount(sc.nextFloat());
    }
    void display(){
        System.out.println("=================================");
        System.out.println("Account Number :- "+ob.getAcc_no());
        System.out.println("Your Name :- "+ob.getName());
        System.out.println("Your E-mail :- "+ob.getE_mail());
        System.out.println("Your Bank Balance :- "+ob.getAmmount());
    }
    public static void main (String args[]){
        Encaps2b ob1=new Encaps2b();
        ob1.Account();
        ob1.display();
    }
}
