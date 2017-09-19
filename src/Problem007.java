import java.util.Scanner;

/**
 * 007. Reverse Integer
 * --Problem Description
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 *
 * Have you thought about this?
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * --Note:
 * The input is assumed to be a 32-bit signed integer.
 * Your function should return 0 when the reversed integer overflows.
 */
public class Problem007 {
    public int reverse(int x) {
        long  ans = 0, flag = 0, x1 = x;
        if (x < 0) {
            x1 = -x1;
            flag =1;
        }
        while (x1!=0) {
            ans*=10;
            ans+=(x1%10);
            x1/=10;
        }
        if (ans > Integer.MAX_VALUE) {
            return 0;
        }
        if (flag == 1) {
            ans = -ans;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        Problem007 test = new Problem007();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input an integer:");
        int x = scanner.nextInt();
        System.out.println(test.reverse(x));
    }
}
