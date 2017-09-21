import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *013. Roman to Integer
 * --Problem Description:
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class Problem13 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('X', 10);
        map.put('C', 100);
        map.put('M', 1000);
        map.put('V', 5);
        map.put('L', 50);
        map.put('D', 500);
        int ans = 0, current , last =0;
        for (int i = s.length()-1; i >=0; i--) {
            current = map.get(s.charAt(i));
            if (current < last){
                ans -= current;
            }else {
                ans += current;
            }
            last = current;
        }
        return ans;
    }

    public static void main(String[] args) {
        Problem13 test = new Problem13();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a Roman numeral:");
        String s = scanner.nextLine();
        System.out.println(test.romanToInt(s));
    }
}
