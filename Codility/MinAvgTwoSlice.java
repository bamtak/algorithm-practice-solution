

class MinAvgTwoSlice {
    public int solution(int[] A) {
        int minAvgIdx=0;
        double minAvgVal=(double)Integer.MAX_VALUE; 
        double currAvg;
        for(int i=0; i<A.length-2; i++){
            currAvg = ((double)(A[i] + A[i+1]))/2;
            if(currAvg < minAvgVal){
                minAvgVal = currAvg;
                minAvgIdx = i;
            }
            currAvg = ((double)(A[i] + A[i+1] + A[i+2]))/3;
            if(currAvg < minAvgVal){
                minAvgVal = currAvg;
                minAvgIdx = i;
            }
        }
        currAvg = ((double)(A[A.length-2] + A[A.length-1]))/2;
        if(currAvg < minAvgVal){
            minAvgVal = currAvg;
            minAvgIdx = A.length-2;
        }
        return minAvgIdx;
    }
}