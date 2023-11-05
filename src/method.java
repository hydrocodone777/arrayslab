import java.util.Random;
public class method {
    public static void main(String[] args) {
        double dataPoints[] = {7,8,8};
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static double getAverage(double values[]) {
        double sum = 0;
        double average = 0;
        for (int x = 0; x < values.length; x++) {
            sum += values[x];
            average = sum / values.length;
        }
        return(average);
    }
}

