package Question;
public class Arr9 {
    int[] meth1(int arr[]){
        System.out.println("meth called ");
     return arr;   
    }
    public static void main(String[] args) {
        Arr9 ob=new Arr9();
        int input[]={1,2,3};
        int result[]=ob.meth1(input);
        for(int x:result)
        {
            System.out.println(x);
        }            
    }
    
}
