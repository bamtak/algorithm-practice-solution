
public class OddOccurrencesInArray{
    public int solution(int[] A) {
        int sum = 0;
        for (int i=0; i<A.length; i++) sum ^= A[i];
        return sum;
    }
}