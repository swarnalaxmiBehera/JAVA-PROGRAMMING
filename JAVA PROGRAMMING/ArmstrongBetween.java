// Q14..Check armstrong number between two integers.
import java.util.Scanner;
public class ArmstrongBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt(), high = sc.nextInt();
        for (int i = low; i <= high; i++) if (isArmstrong(i)) System.out.print(i + " ");
        sc.close();
    }
    static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = String.valueOf(num).length();
        while (temp > 0) { sum += Math.pow(temp % 10, digits); temp /= 10; }
        return sum == num;
    }
}
