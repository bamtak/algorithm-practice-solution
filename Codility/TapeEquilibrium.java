import java.util.*;
import java.lang.Math;

class TapeEquilibrium{
     public int solution(int[] A) {
        if(A == null) return -1;
        int sum = Arrays.stream(A).sum();
        int pre = 0;
        int diff = Integer.MAX_VALUE;
        for (int i =0; i< A.length-1; i++){
            pre += A[i];
            diff = Math.min(diff, Math.abs(sum - (2*pre)));
        }
        return diff;
    }
}