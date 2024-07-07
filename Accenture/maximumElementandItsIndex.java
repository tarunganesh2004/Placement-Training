import java.util.Scanner;

public class maximumElementandItsIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        // int max = Integer.MIN_VALUE;
        // int j = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        maxIntArray(a, n);
        sc.close();
    }

    public static void maxIntArray(int[] a, int n) {
        int max1 = Integer.MIN_VALUE;
        int max2= Integer.MIN_VALUE;
        int j1 = 0;
        int j2 = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > max1) {
                max2= max1;
                max1 = a[i];
                j1 = i;
            } else if (a[i] > max2) {
                max2 = a[i];
                j2 = i;
            }
            
        }
        System.out.println(max1+" Index: "+j1);
        System.out.println(max2+" Index: "+j2);
        // System.out.println(j1);
        // System.out.println(j2);
    }
}
