package Oops3;
public class Multi4 implements Runnable {
     public void run(){
             int prio=Thread.currentThread().getPriority();
             String name=Thread.currentThread().getName();
         for(int i=1;i<=5;i++)
        System.out.println(name+" thread priority is"+prio);
    }
    public static void main(String[] args) {
        Multi4 ob=new Multi4();
        Thread t=new Thread(ob);
        Thread t1=new Thread (ob);
      t.setName("First thread");
      t1.setName("Second thread ");
     t.setPriority(1);
     t1.setPriority(10);
      t.start();
      t1.start();
    }
}
