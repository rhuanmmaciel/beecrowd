import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> words = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();

        for(sc.nextLine(); i > 0; i--){
            List.of(sc.nextLine().split(" ")).forEach(Main::insert);

            StringBuilder sb = new StringBuilder();
            words.forEach(x -> sb.append(x).append(" "));
            sb.deleteCharAt(sb.length()-1);

            System.out.println(sb);

            words.clear();

        }

    }

    public static void insert(String element){

        int i = 0;
        for(; i < words.size(); i++){

            if(element.length() > words.get(i).length()) break;

        }

        words.add(i, element);

    }

}