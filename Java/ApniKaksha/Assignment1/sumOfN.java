package Learning.Assignment1;
import java.util.*;

class sumOfN {
    public static void nSum(int n){
        int Sum = 0;
        for (int i=1;i<=n;i++){
            Sum = Sum+i;
        }
        System.out.println(Sum);
    }

    public static void main(String[] args){
        /* Qs. Write a function to print the sum of all odd numbers from 1 to n. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a function to print the sum of all odd numbers from 1 to n.");
        System.out.println("Enter Value");
        int n = sc.nextInt();
        nSum(n);
    }
}
