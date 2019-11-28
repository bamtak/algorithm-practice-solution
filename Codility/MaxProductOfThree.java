
import java.util.*;

class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        int l = A.length - 1;
        return Math.max(A[0] * A[1] * A[l], A[l] * A[l-1] * A[l-2]);
    }
}