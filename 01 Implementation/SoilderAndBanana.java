public class SoilderAndBanana {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        // int totalCost = 0;
        // for(int i=1;i<=w;i++) {
        //     totalCost += i*k;
        // }
        int sumofNN = (w * (w + 1)) / 2;
        int totalCost = k * sumofNN;
        if (totalCost > n) {
            System.out.println(totalCost - n);
        } else {
            System.out.println(0);
        }
        sc.close();
    }
}
