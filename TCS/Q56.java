// https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-s0xPcJ-HnkT/
import java.util.*;
public class Q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(lowestNumber(n));
        String s = Integer.toString(n);
        char c[] = s.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        sc.close();
    }

    public static int lowestNumber(int n) { // 34201
        String s = Integer.toString(n);
        int[] a = new int[s.length()]; // 3,4,2,0,1
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i) - '0';
        }
        Arrays.sort(a); // 0,1,2,3,4
        // int num = 0;
        int firstNonZeroIndex = 0;
        while (firstNonZeroIndex < a.length && a[firstNonZeroIndex] == 0) {
            firstNonZeroIndex++;
        }
        if (firstNonZeroIndex == a.length) {
            return 0;
        }
        int num = a[firstNonZeroIndex];
        for (int i = 0; i < firstNonZeroIndex; i++) {
            num = num * 10;
        }
        for (int i = firstNonZeroIndex + 1; i < a.length; i++) {
            num = num * 10 + a[i];
        }
        return num;
    }

    public static int lowestNumber2(int n) {
        String s = Integer.toString(n);
        char c[] = s.toCharArray();
        Arrays.sort(c);
        String res = "";
        if (c[0] == '0') {
            c[0] = c[1];
            c[1] = '0';
        }
        for (char ch : c) {
            res += ch;
        }
        return Integer.parseInt(res);
    }
}
