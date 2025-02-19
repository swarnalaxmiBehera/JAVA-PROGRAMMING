// Q16..Check if a character is vowel or consonant.
import java.util.Scanner;
public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().toLowerCase().charAt(0);
        System.out.println("aeiou".indexOf(ch) != -1 ? "Vowel" : "Consonant");
        sc.close();
    }
}
