import java.util.*;

public class mostFrequentCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char k = sc.next().charAt(0);
        String res = mostFrequent(s, k);
        System.out.println(res);
        sc.close();
    }

    public static String mostFrequent(String s, char k) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        char mostFrequentChar = 0;
        int maxFrequency = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char c = entry.getKey();
            int f = entry.getValue();
            if (f > maxFrequency || (f == maxFrequency && c < mostFrequentChar)) {
                maxFrequency = f;
                mostFrequentChar = c;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == mostFrequentChar) {
                sb.append(k);
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
