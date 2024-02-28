package Learning.Assignment1;
import java.util.*;

class verifyAge {
    static void Verification(int n){
        if (n>=18){
            System.out.println("Person is an Adult");
        }
        else if(n<18){
            System.out.println("Person is a Minor");
        }
        else {
            System.out.println("Enter a valid age");
        }
        return;
    }
    public static void main(String[] args){
        /* Qs. Write a function that takes in age as input and returns if that person is eligible to vote or not.
         A person of age > 18 is eligible to vote. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age [in years] for verification");
        int age = sc.nextInt();
        Verification(age);
    }
}
