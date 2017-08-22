import java.io.*;
import java.util.*;

public class Solution {
static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length())
            return false;
        return (sort(a).equals(sort(b)));
    }

    static String sort(String a){
        char[] sa = a.toCharArray();
        java.util.Arrays.sort(sa);
        return new String(sa);
        
    }
	 public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}