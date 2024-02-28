package Learning;
import java.util.*;

class calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        Input
        System.out.println("Enter values a and b");
        int a = sc.nextInt();
        int b= sc.nextInt();
//        Operation
        System.out.println("Enter Operation");
        String button = sc.next();

//        Switch statement used, defining basic operations [ +, -, *, /, %]
        switch(button){
            case "+":
                System.out.println(a+b);
                break;

            case "-":
                System.out.println(a-b);
                break;

            case "*":
                System.out.println(a*b);
                break;

            case "/":
                System.out.println(a/b);
                break;

            case "%":
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}