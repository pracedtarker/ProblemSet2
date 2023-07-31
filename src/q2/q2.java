package q2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class q2 {
    public static void main(String[] args) {
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of your array: ");
        int usernumber = sc.nextInt();

        if (usernumber == 0) {
            System.out.println("Sorry, I cannot accept an empty array.");
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        }
        else{
            int minArrayVal = -50;
            int maxArrayVal = 50;
            int min = 0;
            int max = 0;
            int[] arr = new int[usernumber];
            for (int i = 0; i < arr.length; i++){
                arr[i] = ThreadLocalRandom.current().nextInt(minArrayVal,maxArrayVal);
            }
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i]>max) {
                    max = arr[i];
                }
            }
            for(int i=0; i<arr.length; i++ ) {
                if(arr[i]<min) {
                    min = arr[i];
                }
            }
            System.out.println(Arrays.toString(arr));
            System.out.println("The minimum value is: " + min);
            System.out.println("The maximum value is: " + max);
            System.out.println();
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
    }
    }
}