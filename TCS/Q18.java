import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String k = sc.nextLine();
        int[] a = new int[26];
        for (int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
            System.out.println(Arrays.toString(a));
        }
        for (int i = 0; i < k.length(); i++) {
            int f = a[k.charAt(i) - 'a'];
            for (int j = 0; j < f; j++) {
                System.out.print(k.charAt(i));
            }
        }
        sc.close();
    }
}
