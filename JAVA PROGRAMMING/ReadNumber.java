// Q1..Read Number From Standard Input
import java.util.Scanner;
public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);
        sc.close();
    }
}
