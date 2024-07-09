// https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-66xPcJ-bsby/
import java.util.*;
// count no.of integers with no repetitive digits in an interval
public class Q58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println(countNumbers(n1, n2));
        sc.close();

    }

    public static int countNumbers(int n1, int n2) {
        int c = 0;
        for (int i = n1; i <= n2; i++) {
            if (nonRepitive(i)) {
                c++;
            }
        }
        return c;
    }

    public static boolean nonRepitive(int n) { // 11
        boolean[] d = new boolean[10];
        Arrays.fill(d, false);
        while (n > 0) {
            int digit = n % 10;
            if (d[digit]) {
                return false;
            }
            d[digit] = true;
            n = n / 10;
        }
        return true;
    }
}
