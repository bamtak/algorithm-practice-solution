
public class Palindrome{
    public static boolean checkPalindrome(String A){
        int j = A.length() - 1, i=0;
        while(i < j){
            if(A.charAt(i) != A.charAt(j)) return false;
            ++i; --j;
        }
        return true;
    }
}