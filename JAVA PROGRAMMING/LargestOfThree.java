// Q9..Find largest among three numbers.
import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Largest: " + Math.max(a, Math.max(b, c)));
        sc.close();
    }
}
