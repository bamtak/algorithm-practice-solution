import java.util.Scanner;

public class Anagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) return false;
        int[] chars = new int[256];
        a = a.toLowerCase();
        b = b.toLowerCase();
        for (int i =0; i< a.length(); i++){
            chars[a.charAt(i)]++;
            chars[b.charAt(i)]--;
        }
        for (int i =0; i< chars.length; i++){
            if(chars[i] != 0) return false;
        }
        return true;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
