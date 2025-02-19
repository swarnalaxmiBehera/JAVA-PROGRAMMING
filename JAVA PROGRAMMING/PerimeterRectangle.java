// Q21..Find peremeter of a rectangle.
import java.util.Scanner;
public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt(), b = sc.nextInt();
        System.out.println("Perimeter: " + (2 * (l + b)));
        sc.close();
    }
}
