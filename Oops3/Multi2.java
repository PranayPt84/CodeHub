package Oops3;
public class Multi2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("meth overrided "+i);
        }
    }
    public static void main(String[] args) {
        Multi2 ob=new Multi2();
         Thread t=new Thread(ob);
         t.start();
         
        // t.run();
    }
}
