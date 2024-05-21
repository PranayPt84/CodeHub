package Ques;

import java.util.Scanner;

public class Ques11 {
public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("please enter Rows you want");
    int a=sc.nextInt();
    for(int i=1;i<=a;i++){
        for(int j=a;j>=i;j--){
            System.out.print(" ");
        }
        for (int k=1;k<=i;k++){
       
        System.out.print("*");
        }
        for(int l=2;l<=i;l++){
            System.out.print("*");
        }
       System.out.println();
    }
   for(int m=1;m<=a;m++){
       for(int n=1;n<=m;n++){
           System.out.print(" ");
       }
      for(int o=a;o>=m;o--){
       System.out.print("*");
      }
      for(int p=a-1;p>=m;p--){
          System.out.print("*");
      }
      System.out.println();
   }
}        
}
