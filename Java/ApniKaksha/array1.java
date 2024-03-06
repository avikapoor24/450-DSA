package Learning;
import java.util.*;

public class array1 {
    public static void main(String[] args){

        //define
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();

        //input
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+ i +"th element");
            arr[i] = sc.nextInt();
        }

        //print
        System.out.println("Printing Array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Select 1 of the Questions [just enter the no.]");
        System.out.println("1. Print th value at 'x' th index.");
        System.out.println("2. Take an input array from the user. Search for a given number x and print at which index it occurs");
        System.out.println();

        System.out.print("Enter a no. ");
        String ques = sc.next();
        switch (ques){
            case"1":
            {
                //Qs. Print 'x' th index
                System.out.println("What index value you want to print");
                int x = sc.nextInt();

                for(int i=0;i<n;i++){
                    if (i == x){
                        System.out.println("Your Required value: "+arr[i]);
                    }
                }
                break;
            }
            case "2":{
                System.out.println("Enter the value you want to search for");
                int x = sc.nextInt();

                for(int i=0;i<n;i++){
                    if (arr[i] == x){
                        System.out.println("Your Required value: "+i);
                    }
                }
                break;
            }
            default: {
                System.out.println("Enter a valid question no.");
            }
        }

        
    }
}
