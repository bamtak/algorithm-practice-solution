import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        BigInteger n = scanner.nextBigInteger();
        scanner.close();
        System.out.println(n.isProbablePrime(10) ? "prime" : "not prime");
    }
}
