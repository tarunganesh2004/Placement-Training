import java.util.*;

class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(sumOfEvenFrequencies(s));
        sc.close();
    }

    public static int sumOfEvenFrequencies(String s) {
        int sum = 0;
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                count++;
            } else {
                if (count % 2 == 0)
                    sum += count;
                count = 1;
            }
        }
        //for last sequence
        if (count % 2 == 0) {
            sum = sum + count;
    }
        return sum;
    }
}