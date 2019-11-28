

public class CyclicRotation{
    public int[] solution(int[] A, int K) {
        if (A == null) return null;
        int len = A.length;
        int[] B = new int[len];
        for (int i = 0; i < len; i++) B[(i + K) % len] = A[i];
        return B;
    }
}