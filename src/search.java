import java.util.Random;
import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double getNumber = SafeInput.getRangedDouble(input, "Enter a number 1-100: ", 1, 100);
        Random rd = new Random();
        int dataPoints[];
        int count = 0;
        dataPoints = new int[100];
        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rd.nextInt(100);
            if (getNumber == dataPoints[x]) {
                count++;
            }
        }
        System.out.println("Matches: " + count);
        }
    }

