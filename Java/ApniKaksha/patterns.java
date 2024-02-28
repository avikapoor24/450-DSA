package Learning;
import java.util.*;

class patterns{
    public static void main(String[] args){

//        patterns_practice
        Scanner sc = new Scanner(System.in);
        int n=4, m=5;
        System.out.println("Preset values of n=" + n + " and " + "m="+m );

//        [Example-1, rectangle with "*", r=4 and c=5]
        System.out.println("Example-1, rectangle with *, r=4 and c=5");
        for(int i=0;i<n;i++){
            for (int j=0;j<m;j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();

//        [Example-2, Hollow Rectangle with "*", r=4 and c=5]
        System.out.println("Example-2, Hollow Rectangle with \"*\", r=4 and c=5");
//        outerloop
        for(int i=1;i<=n;i++){
//            innerloop
            for (int j=1; j<=m; j++){
//                cell -> [i,j]
                if (i == 1 || i == n|| j == 1 || j == m) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println();

//        [Example-3, half pyramid]
        System.out.println("Example-3, Half Pyramid");
//        outerloop
        for(int i=1;i<=n;i++){
//            innerloop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        [Example-4, Inverted half pyramid]
        System.out.println("Example-4, Inverted half pyramid");
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        [Example-5, 180 degree rotated Inverted half pyramid]
        System.out.println("Example-5, 180 degree rotated Inverted half pyramid");
        for(int i=1; i<=n; i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        [Example-6, Numbered half pyramid]
        System.out.println("Example-6, Numbered half pyramid");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

//        [Example-7,Inverted half pyramid with numbers]
        System.out.println("Example-7,Inverted half pyramid with numbers");
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i+1;j++){
                System.out.print( j +" ");
            }
            System.out.println();
        }
        System.out.println();

//        [Example-8,Floyd's Triangle]
        System.out.println("Example-8, Floyd's Triangle");
        int num=1;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print( num +" ");
                num++;
            }
            System.out.println();
        }
        System.out.println();

//        [Example-9,0-1 Triangle]
        System.out.println("Example-9, 0,1 triangle");
        for(int i=1;i<=m;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                //even [i+j]
                if(sum % 2 == 0) {
                    System.out.print(1+" ");
                }
                //odd [i+j]
                else {
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
        System.out.println();

//        [Example-10,Butterfly pattern]
        System.out.println("Example-10, Butterfly pattern");
        //1st half
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces in b/w
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces in b/w
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        System.out.println();

//        Eg-11, Solid Rhombus
        System.out.println("Eg-11, Solid Rhombus");
        for (int i=1; i<=m; i++){
            //spaces
            for (int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        Eg-12, Hollow Rhombus
        System.out.println("Eg-12, Hollow Rhombus");
        for (int i=1; i<=m; i++){
            //spaces
            for (int j=1; j<=m-i; j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=m; j++){
                if (i==1||i==m||j==1||j==m){
                System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

//        Eg-13, Number Pyramid
        System.out.println("Eg-13, Number Pyramid");
        for (int i=1;i<=m;i++){
            //spaces
            for (int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            //Number-loop
            for (int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

//        Eg-14, Palindrome Pattern
        System.out.println("Eg-14, Palindrome Pattern");
        for (int i=1;i<=m;i++){
            //spaces
            for (int j=1;j<=m-i;j++){
                System.out.print(" ");
            }

            //1st half
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }

            //2nd half
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

//        Eg-15, Diamond Pattern
        System.out.println("Eg-15, Diamond Pattern");
        //1st half
        for(int i=1;i<=n;i++){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //spaces
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=2;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}