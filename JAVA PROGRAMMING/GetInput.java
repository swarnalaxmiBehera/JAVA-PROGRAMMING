//Q2.. Get Input from the User
import java.util.Scanner;
public class GetInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("You entered: " + str);
        sc.close();
    }
}
