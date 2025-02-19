// Q15..Check if a number is neon number.
import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), sq = num * num, sum = 0;
        while (sq > 0) { sum += sq % 10; sq /= 10; }
        System.out.println(sum == num ? "Neon Number" : "Not a Neon Number");
        sc.close();
    }
}
