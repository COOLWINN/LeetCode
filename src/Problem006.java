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
        if (numRows <= 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        //初始化
        for (int i = 0; i <numRows; i++) {
            sb[i] = new StringBuilder("");
        }
        int increase = 0, index =0;
        for (int i =0; i < s.length();i++) {
            sb[index].append(s.charAt(i));
            if (index==0) increase=1;
            if (index == numRows-1) increase=-1;
            index+=increase;
        }
        StringBuilder result = new StringBuilder();
        for (int i =0; i < numRows; i++) {
            result.append(sb[i]);
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
