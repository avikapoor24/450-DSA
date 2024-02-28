package Learning.Assignment1;

import java.util.Scanner;

class avgSum {
    public static void Avg(int a,int b,int c){
        System.out.println("Average is " + (a + b + c)/3 );
        return;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qs. Enter 3 numbers from the user & make a function to print their average.");
        System.out.println("Enter Value 1");
        int a= sc.nextInt();
        System.out.println("Enter Value 2");
        int b= sc.nextInt();
        System.out.println("Enter Value 3");
        int c= sc.nextInt();
        Avg(a,b,c);
    }
}
