package Oops3;

public class Multi3 extends Thread {
public void run(){
    for(int i=1;i<=5;i++){
     
            Thread.currentThread().setPriority(10);
        System.out.println(Thread.currentThread().getName()+" is the "+i+" good person");
    }
   
}  
    public static void main(String[] args) throws InterruptedException {
        Multi3 ob=new Multi3();
        Thread t=new Thread(ob);
        t.setName("Patidar");
        t.start();
        sleep(3000);
        for(int i=1;i<=5;i++){
            System.out.println("Pranay");
        }
        
    }           
}
