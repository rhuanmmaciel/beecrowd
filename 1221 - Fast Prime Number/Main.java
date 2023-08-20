import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i = sc.nextInt(); i > 0; i--){

            int number = sc.nextInt();
            if(!isPrime(number)) System.out.print("Not ");

            System.out.println("Prime");

        }

    }

    static boolean isPrime(int n) {

        for (int i = (int)Math.sqrt(n); i > 1; i--)
            if (n % i == 0) return false;

        return true;

    }
}
