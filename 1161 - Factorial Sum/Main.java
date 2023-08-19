import java.math.BigInteger;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BigInteger n;
        BigInteger m;

        try {

            while (true) {

                System.out.println(factorial(sc.nextBigInteger()).add(factorial(sc.nextBigInteger())));

            }

        }catch (NoSuchElementException ignored){}

    }

    public static BigInteger factorial(BigInteger n){

        if(n.equals(BigInteger.ZERO)) return BigInteger.ONE;

        return n.multiply(factorial(n.subtract(BigInteger.ONE)));

    }

}
