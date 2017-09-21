/**
 * Problem 014. Longest Common Prefix
 * --Description:
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class Problem014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder result = new StringBuilder();
        int bound = Integer.MAX_VALUE;
        for( int i =0;i<strs.length;i++) {
            bound = Math.min(bound, strs[i].length());
        }
        for (int i = 0; i < bound; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != c) {
                    return result.toString();
                }
            }
            result.append(c);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Problem014 test = new Problem014();
        String[] strs = {"abc", "abcccc", "abccdekdk"};
        System.out.println(test.longestCommonPrefix(strs));
    }
}
