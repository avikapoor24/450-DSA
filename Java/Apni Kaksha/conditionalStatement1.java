package Learning;
import java.util.*;

class conditionalStatement1 {
    public static void main(String[] args){
//        if_statements
//        [eg-1, Even or Odd]
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value");
        int x = sc.nextInt();

//        If Statement used, remainder of a no. "x" by 2 is always zero if it is _even_ else it is _odd_
        if (x%2 == 0){
            System.out.println("Even no.");
        }
        else{
            System.out.println("Odd no.");
        }
        System.out.println("\n");

//        [eg-2, Equal, greater or lesser Condition]
        System.out.println("Enter 2nd value for Comparison");

//        If Statement used, Comparison b/w 2 no.s ( =, <, >)
        int y= sc.nextInt();
        if (x == y) {
            System.out.println("Both numbers are Equal");
        }
        else if (x >= y) {
            System.out.println( x +">"+ y);
        }
        else {
            System.out.println(x +"<"+ y);
        }
    }
}