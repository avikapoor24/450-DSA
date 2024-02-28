package Learning;
import java.util.*;

class functions{
//    __Functions/Methods__

    /* Qs. Print Your Name Function */
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }

    /* Qs. Make a function to check if a number is prime or not. */
    //Prime no. -> Natural number, -> More than 2 factors.
    public static void chkPrime(int n){
        if (n<1){
            System.out.print("Invalid input, enter a Natural No.");
        }
        else{
            int count=0;
            for (int i=1;i<=n;i++){
                if(n%i==0){
                 count++;
                }
            }
            if (count==2){
                System.out.println("Prime no.");
            }
            else {
                System.out.println("Not a Prime no.");
            }
        }
        return;
    }

    /* Qs. Make a function to check if a given number n is even or not. */
    public static void evenOdd(int n){
        if (n%2==0){
            System.out.println("Even no.");
        }
        else {
            System.out.println("Odd no.");
        }
        return;
    }

    /* Table of a number till 10 */
    public static void table(int n){
        for (int i=1;i<=10;i++){
            System.out.println(n+"x"+i+"="+n*i);
        }
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for analysis");
        int n = sc.nextInt();
        //Prime Test
        System.out.println("1. Testing for prime no.");
        chkPrime(n);
        //Even/Odd no.
        System.out.println("2. Even or odd no.");
        evenOdd(n);
        //Table of this no.
        System.out.println("3. Table of "+n+" till 10");
        table(n);
    }
}