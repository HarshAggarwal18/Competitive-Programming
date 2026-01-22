import java.lang.reflect.Array;
import java.util.ArrayList;

public class SumOfRoundNumbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int q = sc.nextInt();
        int []nums = new int[q];
        for (int i = 0; i < q; i++) {
            nums[i] = sc.nextInt();
        }
        while(q-- > 0){
            int n = nums[nums.length -q -1];
            int cnt = 0;
            int nonZeroCount = 0;
            ArrayList<Integer> res = new ArrayList<>();
            while(n > 0){
                cnt++;
                int rem = n % 10;
                if(rem != 0){
                    nonZeroCount++;
                    int num = rem * (int)Math.pow(10, cnt -1);
                    // System.out.print(num + " ");
                    res.add(num);
                }  
                n = n / 10;    
            }
            System.out.println(nonZeroCount);
            for( int i : res){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
