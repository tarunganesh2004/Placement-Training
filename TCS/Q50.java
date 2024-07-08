    // https://learn.facecampus.org/fn/tcs-digital-advanced/exam/5f7875-4Y3McJ-6LBh/
    import java.util.*;

    public class Q50 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(lucky(s));
            
            sc.close();
        }

        public static int lucky(String s) {
            int sum = 0;
            // String r = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isAlphabetic(c)) {
                    if(Character.isUpperCase(c)) {
                        sum = sum + c - 'A' + 1;
                    } else {
                        sum = sum + c - 'a' + 1;
                    }
                }
            }
            while (sum >= 10) {
                sum = sumDigits(sum);
            }
            return sum;
        }
        
        public static int sumDigits(int n) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
