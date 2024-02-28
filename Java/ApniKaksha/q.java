package Learning;
import java.util.*;
class q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a,b and c");
        int c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum= a+b+c;
        int mul= a*b;
        int sub= a-b;
        int div= a/b;
        int modu= a%b;

        System.out.println(sum);
//        System.out.println(sub);
//        System.out.println(mul);
//        System.out.println(div);
//        System.out.println(modu);
    }
}