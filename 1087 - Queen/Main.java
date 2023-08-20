import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x1, y1, x2, y2;

        while((x1 = sc.nextInt()) != 0){

            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();

            System.out.println(calculate(x1, y1, x2, y2));

        }

    }

    public static int calculate(int x1, int y1, int x2, int y2){

        if(x1 == x2 && y1 == y2) return 0;
        if(x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) return 1;
        return 2;

    }

}