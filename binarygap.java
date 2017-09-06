// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
       String binary = Integer.toBinaryString(N);
    int longestBinaryGap = 0;

    for (int i = 0; i < binary.length() - 1; i++) {

    if (binary.substring(i, i + 2).equals("10") && binary.substring(i + 2, binary.length()).contains("1")) {
    int tmpBinaryGap = binary.substring(i + 1, binary.indexOf("1", i + 1)).length();
        longestBinaryGap = Math.max(tmpBinaryGap, longestBinaryGap);
        }
        }
return longestBinaryGap;
    }
}