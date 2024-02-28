package Learning.Assignment1;
import java.util.*;

class perimeter {
     public static void peri(int r) {
         System.out.println("Perimeter of Circle is "+ 2*(3.14)*r);
         return;
    }
    public static void main(String[] args) {
         /* Qs. Write a function that takes in the radius as input and returns the circumference of a circle. */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius");
        int r= sc.nextInt();
        peri(r);
    }
}
