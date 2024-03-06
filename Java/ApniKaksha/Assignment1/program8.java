package Learning.Assignment1;
import java.util.*;

/* Qs. Two numbers are entered by the user, x and n.
 Write a function to find the value of one number
 raised to the power of another i.e. x^n. */
public class program8 {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of x");
        int x = sc.nextInt();
        System.out.println("Enter Value of n");
        int n = sc.nextInt();

        //loop for x^n
        int pow=1;
        for (int i=1;i<=n;i++){
            pow = x*pow;
        }
        System.out.println("x^n = "+pow);
    }
}
