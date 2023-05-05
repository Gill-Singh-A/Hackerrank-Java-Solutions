import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        int max = -82;
        for(int y = 2; y < 6; y++)
            for(int x = 2; x < 6; x++)
                if(arr[y-2][x-2]+arr[y-2][x-1]+arr[y-2][x]+arr[y-1][x-1]+arr[y][x-2]+arr[y][x-1]+arr[y][x]>max)
                    max = arr[y-2][x-2]+arr[y-2][x-1]+arr[y-2][x]+arr[y-1][x-1]+arr[y][x-2]+arr[y][x-1]+arr[y][x];
        System.out.println(max);
        scanner.close();
    }
}