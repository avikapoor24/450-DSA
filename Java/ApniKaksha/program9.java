package Learning;
import java.util.*;
/* Qs.Write a program to print Fibonacci series of n terms where n is input by user */
public class program9 {
    public static void Fibo(int n){
        int a=0,b=1;
            System.out.print(a + " ");
            if(n>1){
                for (int i=2; i<=n; i++) {
                    System.out.print(b+" ");
                    int temp = b;
                    b = a+b;
                    a=temp;
                }
            }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        Fibo(n);
    }
}
