import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] avgrs) {
        Scanner scan = new Scanner(System.in);
        BigInteger a = new BigInteger(scan.next());
        System.out.println(a.isProbablePrime(100)?"prime":"not prime");
    }
}