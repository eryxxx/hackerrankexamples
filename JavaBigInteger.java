import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner scan=new Scanner(System.in);
         BigInteger first = new BigInteger(scan.next());
         BigInteger second = new BigInteger(scan.next());
         BigInteger  sum, mul;
         sum = first.add(second);
         mul = first.multiply(second);
         System.out.println( sum);
         System.out.println( mul);
        
    }
}