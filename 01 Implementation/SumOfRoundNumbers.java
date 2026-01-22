import java.util.*;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayList<Integer> res = new ArrayList<>();

            int place = 1;
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    res.add(digit * place);
                }
                n /= 10;
                place *= 10; // power of 10
            }

            System.out.println(res.size()); // non zero digits count
            for (int x : res) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
