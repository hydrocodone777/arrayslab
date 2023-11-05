import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        int dataPoints[];
        dataPoints = new int[100];
        for (int x = 0; x < dataPoints.length; x++) {
            dataPoints[x] = rd.nextInt(100);
        }
        for (int x = 0; x < dataPoints.length; x++) {
            System.out.print(dataPoints[x]);
            System.out.printf(" | ");
        }
        int sum = 0;
        double average = 0;
        for (int x = 0; x < dataPoints.length; x++) {
            sum += dataPoints[x];
            average = (double) sum / dataPoints.length;
        }
        System.out.println();
        System.out.println(sum + " is the sum");
        System.out.println(average + " is the average");
    }
}
