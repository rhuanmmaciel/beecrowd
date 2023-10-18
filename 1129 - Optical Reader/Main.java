import java.util.*;

class Main {

    public enum Color{
        WHITE, BLACK;

        public static Color findColor(int grayScale){

            if(grayScale <= 127) return BLACK;

            return WHITE;

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean stop;

        do {
            stop = true;
            for (int i = sc.nextInt(); i > 0; i--) {

                stop = false;
                List<Color> colors = new ArrayList<>();
                for (int j = 0; j < 5; j++)
                    colors.add(Color.findColor(sc.nextInt()));

                String txt = colors.stream().filter(x -> x.equals(Color.BLACK)).toList().size() != 1 ? "*" :
                        Character.toString('A' + colors.indexOf(Color.BLACK));

                System.out.println(txt);

            }
        }while (!stop);

    }


}