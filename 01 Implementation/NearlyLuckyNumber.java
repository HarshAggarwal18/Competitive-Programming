import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n!=0) {
            int rem = n % 10;
            if(rem != 4 && rem != 7) {
                System.out.println("NO");
                return;
            }
            n = n / 10;
        }
        System.out.println("YES");
        sc.close();
    }
}
