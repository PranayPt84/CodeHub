package Oops2;

public class Poly3 {
    void meth1(){
         System.out.println("JAY SHREE RAM");
    }
    void meth1(int a){
        System.out.println("JAY SHREE KRISHNA");
    }
    void meth1(String a){
       System.out.println("SITA RAM");
    }
    int meth1(String a,int b){
       System.out.println("RADHE RADHE");
        return b;
    }
    String meth1(int b,String a){
        System.out.println("JAI SHREE MAHANKAL");
        return a;
    }
    private void meth1(String a,String b){
        System.out.println("JAI MATA DII");
    }
    private void meth1(int a ,int b){
        System.out.println("JAI MAA KALI");
    }
    void meth1(float a){
        System.out.println("JAI MAA DURGE");
    }
    void meth1(int a ,float b){
        System.out.println("HANUMAN DADA KI JAY");
    }
    void meth1(float a ,float b){
        System.out.println("BAJRANGBALI KI JAY");
    }
    private void meth1(String a,float b){
        System.out.println("JAY BHOLE");
    }
    private float meth1(float a,String b){
        System.out.println("BAM BHOLE");
        return a;
    }
public static void main (String args[]){
    Poly3 ob =new Poly3();
    ob.meth1();
    ob.meth1("aaa");
    ob.meth1((float) 12.33);
    ob.meth1("aa","bb");
    ob.meth1((float)22.33,(float)33.22);
    ob.meth1(1,3);
    ob.meth1("aaa",33);
    ob.meth1(33,"aaa");
    ob.meth1((float)33.44,"aa");
    ob.meth1("aa",(float) 56.44);
    ob.meth1(4);
    ob.meth1(12,(float)33.2);
    
}    
}
