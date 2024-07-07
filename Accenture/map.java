import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        int[] a = { 1, 0, 1, 2, 3, 1, 0, 1 };
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if (m.containsKey(a[i])) {
                m.put(a[i], m.get(a[i]) + 1);
            } else {
                m.put(a[i], 1);
            }

        }
        for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(m);
    }
}
