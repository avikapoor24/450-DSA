package Learning.Assignment1;
import java.util.Scanner;

class greaterOf2 {
    public static void comparisonOf2(int a, int b){
        if (a>b) {
            System.out.println(a+" is Greater");
        }
        else if(a==b){
            System.out.println("Equal Values");
        }
        else {
            System.out.println(b+" is Greater");
        }
    }
    public static void main(String[] args){
        /* Qs. Write a function which takes in 2 numbers and returns the greater of those two. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Qs. Write a function which takes in 2 numbers and returns the greater of those two.");
        System.out.println("Enter Value a");
        int a = sc.nextInt();
        System.out.println("Enter Value b");
        int b = sc.nextInt();
        comparisonOf2(a,b);
    }
}
