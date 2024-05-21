package Oops2.abstractMethods;

public class Abstr1b extends Abstr1a {
    void meth1() {
        System.out.println("this is overrided meth1()");
    }
    void meth4() {
        System.out.println("this is meth4()");
    }
    public static void main(String[] args) {
        Abstr1a abstr1a = new Abstr1b();
        abstr1a.meth1();
        abstr1a.meth2();
        abstr1a.meth3();
        new Abstr1b().meth4();
    }
}
