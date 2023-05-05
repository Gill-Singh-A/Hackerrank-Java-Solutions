import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static int isHere(String s) {
        String c = "end-of-file";
        int k = s.length(), p = 0;
        for(int i = 0; i < k; i++)
            if(s.charAt(i)==c.charAt(p)) {
                p++;
                for(int j = ++i; ; j++) {
                    if(s.charAt(j)!=c.charAt(p)) {
                        p = 0;
                        break;
                    }
                    p++;
                }
                return 1;
            }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        for(int i = 1; s.hasNext(); i++) {
            System.out.println(i+" "+s.nextLine());
        }
    }
}
