// Q5..Add two binary strings.
import java.util.Scanner;
public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two binary numbers: ");
        String a = sc.next(), b = sc.next();
        int sum = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);
        System.out.println("Sum: " + Integer.toBinaryString(sum));
        sc.close();
    }
}
