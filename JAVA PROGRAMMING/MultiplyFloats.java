// Q3..Multiply two floating numbers.
import java.util.Scanner;
public class MultiplyFloats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two floating numbers: ");
        float a = sc.nextFloat(), b = sc.nextFloat();
        System.out.println("Product: " + (a * b));
        sc.close();
    }
}
