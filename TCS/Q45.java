import java.util.*;
public class Q45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(combination(s1, s2));
        sc.close();
    }

    public static String combination(String s1, String s2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (char c : s1.toCharArray()) {
            freq1[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            freq2[c - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq1[i] > 0 && freq2[i] > 0) {
                int count = Math.min(freq1[i], freq2[i]);
                while (count > 0) {
                    sb.append((char) (i + 'a'));
                    count--;
                }
            }
        }
        return sb.toString();
    }
}
