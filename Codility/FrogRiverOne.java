
import java.util.*;

class FrogRiverOne{
    public int solution(int X, int[] A) {
        if(A == null) return -1;
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i< A.length; i++){
            s.add(A[i]);
            if (s.size() == X) return i;
        }
        return -1;
    }
}