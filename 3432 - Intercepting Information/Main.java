import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(Arrays.asList(new Scanner(System.in).nextLine().split(" ")).contains("9") ? "F" : "S");

    }

}