package q3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class q3 {public static void main(String[] args) {
    System.out.print("Current Time in milliseconds = ");
    System.out.println(System.currentTimeMillis());
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the size of your array: ");
    int usernumber = sc.nextInt();
    if (usernumber == 0) {
        System.out.println("Sorry, I cannot accept an empty array.");
        System.out.println();
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
    } else {
        int minArrayVal = -50;
        int maxArrayVal = 50;
        int[] arr = new int[usernumber];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(minArrayVal, maxArrayVal);
        }
        int a = arr[0], b = arr[1];
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] * arr[j] > a * b){
                    a = arr[i];
                    b = arr[j];
                }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max product pair is (" +
                a + ", " + b + ")");
        System.out.println("The maximum product is: " + a*b);
        System.out.println();
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
    }
}
}