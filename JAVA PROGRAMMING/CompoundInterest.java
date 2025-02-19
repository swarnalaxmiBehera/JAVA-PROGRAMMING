// Q20..Find Compound Interest.
import java.util.Scanner;
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        System.out.println("Compound Interest: " + (p * Math.pow(1 + r / 100, t) - p));
        sc.close();
    }
}
