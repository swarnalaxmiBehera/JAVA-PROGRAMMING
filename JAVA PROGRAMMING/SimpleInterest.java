// Q19..Find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat(), r = sc.nextFloat(), t = sc.nextFloat();
        System.out.println("Simple Interest: " + (p * r * t / 100));
        sc.close();
    }
}
