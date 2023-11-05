import java.util.Random;
import java.util.Scanner;

public class searchtwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double getNumber = SafeInput.getRangedDouble(input, "Enter a number 1-100: ", 1, 100);
        Random rd = new Random();
        int dataPoints[];
        int count = 0;
        int x = 1;
        dataPoints = new int[100];

        while (x < dataPoints.length) {
            dataPoints[x] = rd.nextInt(100);
            if (getNumber == dataPoints[x]) {
                count = x;
                break;
            }
            x++;

        }
            System.out.println("Matched at " + count);
        }
    }