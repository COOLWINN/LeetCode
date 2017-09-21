import java.util.Scanner;

/**
 * 009. Palindrome Number
 * --Problem Description:
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Problem009 {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int base = 1;
        while (x / base >= 10) {
            base*=10;
        }
        while (x > 0) {
            if (x / base != x % 10) {
                return false;
            }
            x = x - x / base * base;
            x/=10;
            base/=100;
        }
        return true;
    }

    public static void main(String[] args) {
        Problem009 test = new Problem009();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an Integer: ");
        int x = scanner.nextInt();
        System.out.println(test.isPalindrome(x));
    }
}
