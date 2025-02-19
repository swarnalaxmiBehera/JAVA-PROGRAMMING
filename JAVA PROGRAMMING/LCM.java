// Q10..LCM of two numbers.
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int lcm = (a * b) / gcd(a, b);
        System.out.println("LCM: " + lcm);
        sc.close();
    }
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
}
