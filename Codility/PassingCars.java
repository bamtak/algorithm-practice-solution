

class PassingCars{
    public int solution(int[] A) {
        int east = 0;
        int result = 0;
        for (int i=0; i< A.length; i++){
            if (A[i] == 0) east += 1;
            else result += east;
            if(result > 1000000000) return -1;
        }
        return result;
    }
}