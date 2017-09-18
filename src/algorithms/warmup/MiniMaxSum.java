package algorithms.warmup;

import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        long sum = 0;

        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
            sum += arr[arr_i];
        }

        long max = 0;
        long min = sum;

        for(int i = 0; i<5; i++) {
            long newSum = sum - arr[i];
            if(max < newSum) {
                max = newSum;
            }
            if(min > newSum) {
                min = newSum;
            }
        }

        System.out.println(max + " " + min);
    }
}
