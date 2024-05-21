package Oops3;
public class Multi1a extends Thread{
public void run(){
    for(int i=0;i<5;i++){
    System.out.println("default method =>"+i);
    }
}    
    public static void main(String[] args) {
        Multi1a ob=new Multi1a();
        Thread ob1=new Thread(ob);
        ob1.start();
    }
}
