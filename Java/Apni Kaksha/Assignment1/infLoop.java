package Learning.Assignment1;
import java.util.*;

class infLoop{
    /* Qs. Write an infinite loop using do while condition. */
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Infinite Loop");
         int i=1;
         do {
             System.out.println(i);
             i++;
         }while(i>=1);
     }
}
