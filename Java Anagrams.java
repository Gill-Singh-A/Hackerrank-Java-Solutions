import java.util.Scanner;

public class Solution {
    static boolean isAnagram(String a, String b) {
        int A[] = new int[26];
        int B[] = new int[26];
        int j = a.length()-1, k = b.length()-1;
        if( j != k )
            return false;
        while( j >= 0 ) {
            if(a.charAt(j)>=65&&a.charAt(j)<=90)
                A[a.charAt(j)-65]++;
            else
                A[a.charAt(j)-97]++;
            if(b.charAt(j)>=65&&b.charAt(j)<=90)
                B[b.charAt(j)-65]++;
            else
                B[b.charAt(j)-97]++;
            j--;
        }
        for(int i = 0; i < 26; i++)
            if(A[i]!=B[i])
                return false;
        return true;
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