import java.util.Random;
import java.util.Scanner;

public class searchthree {
    public static void main(String[] args) {
        Random rd = new Random();
        int dataPoints[];
        int count = 0;
        int min = 0;
        int max = 0;
        dataPoints = new int[100];
        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rd.nextInt(100);
            if (dataPoints[x] > max) {
                max = dataPoints[x];
            }
            if (min > dataPoints[x]) {
                min = dataPoints[x];
            }

        }
        System.out.println("Maximum is " + max);
        System.out.println("Minimum is " + min);

    }
}
