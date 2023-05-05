import java.util.*;
import java.io.*;

class Solution {
    public static int power(int n, int e) {
        int a = 1;
        for(int i = 0; i < e; i++)
            a *= n;
        return a;
    }
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0; j < n; j++) {
                a += b*power(2, j);
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
