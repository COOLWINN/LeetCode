/**
 * 006. ZigZag Conversion
 * --Problem Description:
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number
 * of rows like this: (you may want to display this pattern in a fixed font for better legibility):
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * Write the code that will take a string and make this conversion given a number of rows:
 * string convert(string text, int nRows);
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class Problem006 {
    public String convert(String s, int numRows) {
        int n = s.length(), now = 0;
        StringBuilder result = new StringBuilder();

        while (now < n) {
            result.append(s.charAt(now));
            now += (2*numRows-2);
        }

        for (int i =1; i < numRows-1;i++) {
            int count = 0;
            while (count < n) {
                count++;
                if (count % 2!=0) {
                    now = (count - 1) * (numRows - 1) + i;
                }else {
                    now = (count - 1) * (numRows - 1) + numRows - i - 1;
                }
                if (now >= n) continue;
                result.append(s.charAt(now));
            }

        }
        now = numRows-1;
        while (now < n) {
            result.append(s.charAt(now));
            now += (2 * numRows - 2);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Problem006 test = new Problem006();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(test.convert(s, numRows));
    }

}
