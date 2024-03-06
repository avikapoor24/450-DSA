package Learning.Assignment1;
import java.util.*;

class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int zeros = 0;
        int positive = 0;
        int negative = 0;

        int number;
        do {
            System.out.print("Enter a number (Enter 0 to stop): ");
            number=scanner.nextInt();

            if (number>0){
                positive++;
            }
            else if (number<0) {
                negative++;
            }
            else {
                zeros++;
            }
        }while (number!=0);

        System.out.println("Positive: "+positive);
        System.out.println("Zeroes: "+zeros);
        System.out.println("Negative: "+negative);
    }
}
