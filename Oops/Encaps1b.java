package Oops;
import java.util.Scanner;
public class Encaps1b {
        Encaps1a ob=new Encaps1a();
        Scanner sc=new Scanner(System.in);
    void empdata(){
        System.out.println("Plese enter Employe Name :- ");
        ob.setEmp_Name(sc.next());
        System.out.println("Please enter Employe Id:- ");
        ob.setEmp_Id(sc.nextInt());
        System.out.println("Please enter Employe Salary:- ");
        ob.setSal(sc.nextInt());
        System.out.println("Plese enter Employe Department:- ");
        ob.setDept(sc.next());
        System.out.println("Please enter Employe Address:- ");
        ob.setAdd(sc.next());
        
    }
    void display(){
        System.out.println("================================");
        System.out.println("Employe Name :- "+ob.getEmp_Name());
        System.out.println("Employe Id :- "+ob.getEmp_Id());
        System.out.println("Employe Salary :- "+ob.getSal());
        System.out.println("Employe Department :- "+ob.getDept());
        System.out.println("Employe Address :- "+ob.getAdd());
    }
    public static void main(String args[]){
        Encaps1b ob1=new Encaps1b();
        ob1.empdata();
        ob1.display();
    }
}
