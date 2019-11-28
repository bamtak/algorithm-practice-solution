
import java.util.*;


class PermMissingElem {
    
    public static int solution(int[] A) {
		// write your code in Java SE 8
		Set<Integer> s = new HashSet<>();

		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) s.add(A[i]);
		}
		
		for(int i = 1 ; i < Integer.MAX_VALUE; i++) {
			if(!s.contains(i)) return i;
		}

		return 1;
	}
}