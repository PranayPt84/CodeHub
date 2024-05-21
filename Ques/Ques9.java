package Ques;

import java.util.Scanner;

public class Ques9 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plese enter a number");
        int a = sc.nextInt();
        int i = 1;
        if (a % 2 != 0) {
            while (i <= a) {

                System.out.println(i);
                i = i + 2;
            }
        } 
        else {
               while (i<a) {

                System.out.println(i);
                i = i + 2;
            
        }
    }
} 
}