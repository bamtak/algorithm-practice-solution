

class PermCheck {
    public int solution(int[] A) {
        int sum = 0;
        for (int i=0; i< A.length; i++) {
            sum ^= A[i];
            sum ^= i+1;
        }
        return sum > 0 ? 0 : 1;
    }
}