import java.util.*;
import java.lang.Math;

class MaxCounters {
    
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int max_counter = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] == N+1)  Arrays.fill(counters, 0, N, max_counter);
            else {
                counters[A[i]-1] += 1;
                max_counter = Math.max(max_counter, counters[A[i]-1]);
            }
        }
        return counters;
    }

    public int[] solution2(int N, int[] A) {
        int[] counters = new int[N];
        int max_counter = 0;
        int last_max = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] == N+1) last_max = max_counter;
            else {
                counters[A[i]-1] = Math.max(last_max, counters[A[i]-1]);
                counters[A[i]-1] += 1;
                max_counter = Math.max(max_counter, counters[A[i]-1]);
            }
        }
        for(int i=0; i<counters.length; i++) {
            counters[i] = Math.max(last_max, counters[i]);
        }
        return counters;
    }
}