package Oops;
import java.util.Scanner;
public class Encaps3b {
        Encaps3a obj=new Encaps3a();
    void display(){
        System.out.println("==================================");
        System.out.println("Patient id = "+obj.getPatient_id());
        System.out.println("Patient name = "+obj.getName());
        System.out.println("Pasword ="+obj.getPassword());
        System.out.println("G_mail = "+obj.getG_mail());
        System.out.println("Number = "+obj.getContactNumber());
    }
          public static void main(String args){
         Encaps3b ob=new Encaps3b();
        Scanner sc=new Scanner(System.in);
         System.out.println("plese enter your patient id ");
         ob.obj.setPatient_id(sc.nextInt());
         System.out.println("Please enter your Name ");
         ob.obj.setName(sc.next());
         System.out.println("plese enter your password ");
         ob.obj.setPassword(sc.next());
         System.out.println("plese enter your mail id");
         ob.obj.setG_mail(sc.next());
         System.out.println("pelse enter your contact no");
        ob. obj.setContactNumber(sc.nextInt());
        ob.display();
}   
}  

