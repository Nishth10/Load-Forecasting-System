import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days data: ");
        int n = sc.nextInt();

        double[] load = new double[n];
        double sum = 0;

        // Input data
        for (int i = 0; i < n; i++) {
            System.out.print("Enter load for day " + (i + 1) + ": ");
            load[i] = sc.nextDouble();
            sum += load[i];
        }

        // Average
        double avg = sum / n;

        // Trend
        double trend = load[n - 1] - load[n - 2];

        // Final prediction (weighted)
        double prediction = avg + (trend * 0.5);

        System.out.println("\nAverage Load: " + avg);
        System.out.println("Trend: " + trend);
        System.out.println("Final Predicted Load: " + prediction);
    }
}