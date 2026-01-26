import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt4 = 0;
        int cnt7 = 0;
        for(char c : s.toCharArray()) {
            if(c != '4' && c != '7') {
                System.out.println("NO");
                sc.close();
                return;
            }
            if(c == '4') {
                cnt4++;
            }else if (c == '7') {
                cnt7++;
            }
        }
        if(cnt4>0&&cnt7>0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        sc.close();
    }
}
