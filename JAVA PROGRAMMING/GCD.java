// Q11..GCD Of two numbers.
import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("GCD: " + gcd(a, b));
        sc.close();
    }
    static int gcd(int a, int b) { return b == 0 ? a : gcd(b, a % b); }
}
