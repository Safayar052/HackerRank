package algorithms.warmup;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];

        int mainSum = 0;
        int revSum = 0;

        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if(a_i == a_j) {
                    mainSum += a[a_i][a_j];
                }

                if((a_i+a_j) == (n-1)) {
                    revSum += a[a_i][a_j];
                }
            }
        }

        System.out.println(Math.abs(mainSum-revSum));
    }

}
