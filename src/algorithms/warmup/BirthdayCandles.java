package algorithms.warmup;

import java.util.Scanner;

public class BirthdayCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        int result = 0;
        int max = 0;
        for(int i = 0; i<n; i++) {
            if(max < ar[i]) {
                result = 1;
                max = ar[i];
            }
            else if(max == ar[i]) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
