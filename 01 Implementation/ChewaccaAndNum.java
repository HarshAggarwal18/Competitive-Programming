import java.util.Scanner;

public class ChewaccaAndNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        char[] digits = Long.toString(n).toCharArray();

        for (int i = 0; i < digits.length; i++) {
            int d = digits[i] - '0';
            int val = 9 - d;

            // DO NOT allow leading zero
            if (i == 0 && val == 0) continue;

            if (val < d) {
                digits[i] = (char)(val + '0');
            }
        }

        System.out.println(Long.parseLong(new String(digits)));
        sc.close();
    }
}
