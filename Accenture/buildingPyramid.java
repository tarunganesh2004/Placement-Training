import java.util.Scanner;

public class buildingPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1]; // using dp
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = a[i - 1] + 2 * i + i - 1;
        }
        System.out.println(a[n]);
        // another approach
        // O(1)
        int r = n * (3 * n + 1) / 2;
        System.out.println(r);
        sc.close();
    }
}
