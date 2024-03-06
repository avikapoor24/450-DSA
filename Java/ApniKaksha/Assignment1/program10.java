package Learning.Assignment1;

import java.util.Scanner;

public class program10 {
    public static void GCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
        return;
    }
    public static void main(String[] args){
        /* Qs. Write a function that calculates the Greatest Common Divisor of 2 numbers. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of bigger no.");
        int b = sc.nextInt();
        System.out.println("Enter the value of smaller no.");
        int a = sc.nextInt();
        GCD(a,b);
    }
}
