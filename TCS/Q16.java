import java.util.Arrays;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        // Initial positions of students (1 to n)
        int[] initialPositions = new int[n];
        for (int i = 0; i < n; i++) {
            initialPositions[i] = i + 1;
        }

        // Current positions start as initial positions
        int[] currentPositions = Arrays.copyOf(initialPositions, n);
        // Duplicate array for intermediate steps
        int[] newPositions = new int[n];

        int beats = 0;

        while (true) {
            beats++;
            // Simulate the movements
            for (int i = 0; i < n; i++) {
                newPositions[b[i] - 1] = currentPositions[i];
            }

            // Check if the students are back to their initial positions
            if (Arrays.equals(newPositions, initialPositions)) {
                break;
            }

            // Update the current positions for the next beat
            currentPositions = Arrays.copyOf(newPositions, n);
        }

        System.out.println(beats);
        sc.close();
    }
}
