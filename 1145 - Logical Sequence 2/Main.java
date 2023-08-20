import java.util.Scanner;

public class Main {

    static int limit, elementsPerLine;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        elementsPerLine = sc.nextInt();
        limit = sc.nextInt();

        for(int n = 1; n <= limit; n++) {

            String numbers = "";

            for (int i = 0; i < elementsPerLine && n <= limit; i++) {

                numbers = (i == 0 ? "" : numbers + " ");
                numbers = numbers + (i + 1 == elementsPerLine ? n : n++);

            }

            if (!numbers.isEmpty()) System.out.println(numbers);

        }
    }

}