import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        for(int i = 0; i < amount; i++){

            int x = sc.nextInt(), y = sc.nextInt();
            int rafael = rafael(x, y), beto = beto(x, y), carlos = carlos(x, y);

            int max = Math.max(Math.max(rafael, beto), carlos);

            if(max == rafael) System.out.println("Rafael ganhou");
            else if(max == beto) System.out.println("Beto ganhou");
            else System.out.println("Carlos ganhou");

        }


    }

    public static int rafael(int x, int y){return (int) (Math.pow(3 * x, 2) + y * y);}
    public static int beto(int x, int y){return (int) (2 * x * x + Math.pow(5 * y, 2));}
    public static int carlos(int x, int y){return (int) (- 100 * x + Math.pow(y, 3));}

}