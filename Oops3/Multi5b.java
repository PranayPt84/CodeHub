package Oops3;
public class Multi5b {
    public static void main(String[] args) throws InterruptedException {
        Multi5a ob=new Multi5a();
        ob.start();
        ob.join();
     for(int i=1;i<=5;i++){
         System.out.println("Class b");
     }       
                
    }
    
}
