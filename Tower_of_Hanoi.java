import java.util.Scanner;

public class Tower_of_Hanoi {

    // Recursive function to solve the Tower of Hanoi puzzle
    public static void solveTowerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }
        solveTowerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        solveTowerOfHanoi(n - 1, auxRod, toRod, fromRod);
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        long startTime = System.nanoTime();
        solveTowerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
        long endTime = System.nanoTime();
        long duration = endTime - startTime; // Execution time in nanoseconds

        System.out.println("Total moves: " + (int)(Math.pow(2, n) - 1));
        System.out.println("Execution time: " + duration + " nanoseconds");

        scanner.close();
    }
}
