import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int n = in.nextInt();
            long n3 = Long.valueOf((n - 1) / 3), n5 = Long.valueOf((n - 1) / 5), n15 = Long.valueOf((n - 1) / 15);
            long sum = ((n3 * (1 + n3)) / 2) * 3;
            sum += ((n5 * (1 + n5)) / 2) * 5;
            sum -= ((n15 * (1 + n15)) / 2) * 15;
            System.out.println(sum);
        }
    }
}
