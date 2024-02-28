package Learning;
import java.util.*;

class loops{
    public static void main(String[] args){
//        loops_statements
        Scanner sc = new Scanner(System.in);
//        [eg, Sum of 1st n natural no.s]

//        >input n
        System.out.println("Enter value of n");
        int n = sc.nextInt();
        int sum = 0;
//        >For Loop used, to add all the no.s
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
//        >Sum using for loop
        System.out.println("Sum using for loop = " +sum);

//        _Verification_
//        >using formula n[n+1]/2
        int sumf = n * (n+1) / 2 ;
        System.out.println("Sum using formula = "+sumf);
//        >If statement used for verification
        if (sum == sumf){
            System.out.println("Code Works");
        }
        else{
            System.out.println("Not working");
        }
    }
}