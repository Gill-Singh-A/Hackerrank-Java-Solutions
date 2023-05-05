import java.math.BigDecimal;
import java.util.*;
class Solution{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        BigDecimal[] a = new BigDecimal[n];
        for(int i = 1; i < n; i++) {
            a[i-1] = new BigDecimal(s[i-1]);
            a[i] = new BigDecimal(s[i]);
        }
        for(int i = 0; i < n; i++)
            for(int j = 1; j < n; j++)
                if(a[j-1].compareTo(a[j])<0) {
                    a[j] = a[j].add(a[j-1]);
                    a[j-1] = a[j].subtract(a[j-1]);
                    a[j] = a[j].subtract(a[j-1]);
                    String temp = s[j-1];
                    s[j-1] = s[j];
                    s[j] = temp;
                }
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}