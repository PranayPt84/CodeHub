package Oops3;

public class Multi7 extends Thread{
public void run(){
    System.out.println("Start");
    for(int i=0;i<=5;i++){
        System.out.println("Thread is in Execution process");
    }
    try{
      Thread.sleep(4000);
        
    }
    catch(Exception e){
        System.out.println("Some one intrrupts me in Sleep");
        
    }
    
    System.out.println("end");
    
}    
    public static void main(String[] args) {
        Multi7 ob=new Multi7();
        Thread t=new Thread (ob);
        t.start();
        t.interrupt();
    }
}
 
    

