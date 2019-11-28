
// you can also use imports, for example:
import java.util.*;
import java.lang.Math;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//Solved using prefix sum

class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        int[][] prefix_sum = new int[3][S.length() + 1];
        for (int i=1; i<=S.length(); i++){
            int a=0, c=0, g = 0;
            char ch = S.charAt(i-1);
            if(ch == 'A') a = 1;
            if(ch == 'C') c = 1;
            if(ch == 'G') g = 1;
            prefix_sum[0][i] = prefix_sum[0][i-1] + a;
            prefix_sum[1][i] = prefix_sum[1][i-1] + c;
            prefix_sum[2][i] = prefix_sum[2][i-1] + g;
        }
        
        int[] res = new int[P.length];
        for (int i=0; i<P.length; i++){
            int r = 4, j = Q[i], k = P[i];
            if((prefix_sum[0][j+1] - prefix_sum[0][k]) > 0) r = 1;
            else if ((prefix_sum[1][j+1] - prefix_sum[1][k]) > 0) r = 2;
            else if((prefix_sum[2][j+1] - prefix_sum[2][k]) > 0) r = 3;
            res[i] = r;
        }

        return res;
    }
}