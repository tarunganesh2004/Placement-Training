import java.util.*;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(max(n));
    }

    public static int max(int n) {
        String s = Integer.toString(n);
        List<Integer> l = new ArrayList<>();
        for (char c : s.toCharArray()) {
            l.add(Character.getNumericValue(c));
        }
        Collections.sort(l);
        Collections.reverse(l);
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < l.size(); i++) {
            s1.append(l.get(i));
        }
        return Integer.parseInt(s1.toString());
    }
}
