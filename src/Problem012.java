/**
 * Problem 012. Integer to Roman
 * --Description:
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class Problem012 {
    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String result = "";
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result += romans[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Problem012 test = new Problem012();
        int num = 1984;
        System.out.println(test.intToRoman(num));
    }
}
