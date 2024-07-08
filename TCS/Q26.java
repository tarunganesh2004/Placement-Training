import java.util.*;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.nextLine();
        System.out.println(convert(n, k, s));
    }

    public static int convert(int n, int k, String s) {
        s = s.toLowerCase();
        int operations = 0;
        for (int i = 0; i < k / 2; i++) {
            int[] freq = new int[26];
            for (int j = i; j < n; j = j + k) {
                freq[s.charAt(j) - 'a']++;
                freq[s.charAt(j + (k - 2 * i - 1)) - 'a']++;

            }

            int maxFreq = 0;
            int totalFreq = 0;
            for (int f : freq) {
                maxFreq = Math.max(maxFreq, f);
                totalFreq += f;
            }
            operations += totalFreq - maxFreq;

        }
        return operations;
        

    }
    // public static boolean isPalindrome(String s) {
    //     int i = 0;
    //     int j = s.length() - 1;
    //     while (i < j) {
    //         if (s.charAt(i) != s.charAt(j)) {
    //             return false;
    //         }
    //         i++;
    //         j--;
    //     }
    //     return true;
    // }
}
