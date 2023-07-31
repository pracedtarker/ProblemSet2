package q1;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class q1 {
    public static void main(String[] args) {
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of your array: ");
        int usernumber = sc.nextInt();
        if(usernumber == 0) {
            System.out.println("Sorry, I cannot accept an empty array.");
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        } else {
            int minArrayVal = 1;
            int maxArrayVal = 100;
            int[] arr = new int[usernumber];
            int[] arr2 = new int[usernumber];
            for (int i = 0; i < arr.length; i++){
                arr[i] = ThreadLocalRandom.current().nextInt(minArrayVal,maxArrayVal);
            }
            System.out.println("The elements in your array are: ");
            System.out.println(Arrays.toString(arr));
            System.out.println("The duplicates in your array are: ");
            for(int i=0; i<arr.length; i++) {
                for(int j=i+1; j<arr.length;j++) {
                    if(arr[i]==arr[j]) {
                        arr2[i] = arr[j];
                        System.out.print(arr2[i] + " ");
                    }
                }
            }
            for(int i =0; i<1;i++){
                if(arr2[i] == 0){
                    System.out.println();
                    System.out.println("There are no duplicate numbers in your array");}
            }
            System.out.println();
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        }
    }
}