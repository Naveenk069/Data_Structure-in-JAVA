import java.util.Arrays;
import java.util.Scanner;

public class Mini_Max {

    public static void miniMaxSum(int[] arr) {
        // Calculate the start time
        long startTime = System.nanoTime();

        // Sort the array
        Arrays.sort(arr);

        // Calculate the minimum sum (sum of the first n-1 elements)
        long minSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            minSum += arr[i];
        }

        // Calculate the maximum sum (sum of the last n-1 elements)
        long maxSum = 0;
        for (int i = 1; i < arr.length; i++) {
            maxSum += arr[i];
        }

        // Calculate the end time
        long endTime = System.nanoTime();

        // Output the result
        System.out.println("Min Sum: " + minSum + ", Max Sum: " + maxSum);

        // Calculate and output the running time
        long duration = endTime - startTime;
        System.out.println("Running time: " + duration + " nanoseconds");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
