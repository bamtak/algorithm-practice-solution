

public class FrogJmp{
    public int solution(int X, int Y, int D) {
        int ans = (Y-X) / D;
        return (Y-X) % D == 0 ? ans: ans + 1;
    }
}