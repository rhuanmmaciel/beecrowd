import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line;
        while(!Objects.equals(line = sc.nextLine(), "*")){

            char c = line.toLowerCase().charAt(0);

            System.out.println(Arrays.stream(line.split(" ")).allMatch(x -> x.toLowerCase().charAt(0) == c) ?
                    "Y" :
                    "N");

        }

    }

}