// https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-dB2AcJ-A2Zc/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print(maximum(num, a));
        sc.close();
    }

    public static String maximum(String n, int[] a) {
        int[] num = convert(n);
        boolean changed = false;
        for (int i = 0; i < num.length; i++) {
            int original = num[i];
            int newDigit = a[original];
            if (original < newDigit) {
                num[i] = newDigit;
                changed = true;
            } else if (changed && original > newDigit) {
                break;
            }
        }
        return convertToString(num);
    }

    public static int[] convert(String s) {
        List<Integer> l = new ArrayList<>();
        for (char c : s.toCharArray()) {
            l.add(Character.getNumericValue(c));
        }
        int[] a = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            a[i] = l.get(i);
        }
        return a;
    }

    public static String convertToString(int[] x) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < x.length; i++) {
            s.append(x[i]);
        }
        return s.toString();
    }


    // Simple Method
    public static String convertToMaximum(String s, int[] a) {
        String res = s;
        boolean changed = false;
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - '0';
            if (t < a[t]) {
                res = s.substring(0, i) + a[t] + s.substring(i + 1);
                s = res;
                changed = true;

            } else if (changed && t > a[t]) {
                break;
            }
        }
        return res;
    }
}
