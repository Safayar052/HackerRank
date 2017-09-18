import java.util.Scanner;

public class TestStart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // node number
        int nodeNumber = in.nextInt();

        //read values
        String[] values = in.nextLine().split(" ");

        //read colors
        String[] colors = in.nextLine().split(" ");

        // n-1 subsequent line for edges
        int edgeInput = nodeNumber - 1;
        while(edgeInput>0) {
            String[] edge = in.nextLine().split(" ");
            edgeInput--;
        }


        System.out.println("Hello world!!");
    }
}
