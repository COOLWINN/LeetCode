import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 003.Longest Substring Without Repeating Characters
 *
 * --Problem Description:
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * --Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class Problem003 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        for (int i =0,j=0; j<s.length();j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
                ans = j - i;
            }
            map.put(s.charAt(j), j);
        }
        return ans;
    }

    public static void main(String[] args) {
        Problem003 test = new Problem003();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(test.lengthOfLongestSubstring(s));
    }
}
