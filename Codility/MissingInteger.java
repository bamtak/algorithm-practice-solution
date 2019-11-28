

import java.util.*;

class MissingInteger {
    public int solution(int[] A) {
        Arrays.sort(A);
        int next = 1;
        for (int i=0; i<A.length; i++){
            if (A[i] > next) return next;
            else if(A[i] == next) ++next;
        }
        return next;
    }
}