import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

static boolean flag;
static {
    Scanner scan = new Scanner(System.in);
    int b, h;
    b = scan.nextInt();
    h = scan.nextInt();
    if(b<=0||h<=0) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        flag = false;
    } else {
        flag = true;
        B = b;
        H = h;
    }
};
static int B;
static int H;

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class