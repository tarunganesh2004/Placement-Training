import java.util.Scanner;

public class Q59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(containsMissingLetters(s));
        sc.close();
    }

    public static String containsMissingLetters(String s) {

        s = s.toLowerCase();
        boolean[] b = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            // a[s.charAt(i) - 'a']++;
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                b[ch - 'a'] = true;
            }
        }
        // String res = "";
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (!b[i]) {
                res.append((char) (i + 'a'));
            }
        }
        return res.toString();
    }
}
