import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int input;

        while((input = sc.nextInt()) != 0){

            List<Integer> numbers = new ArrayList<>();
            for(int i = 0; i < input; i++)
                numbers.add(i + 1);

            for(int i = 1; i < Integer.MAX_VALUE; i++)
                if(testNumber(numbers, i)) {

                    System.out.println(i);
                    break;

                }

        }

    }

    private static boolean testNumber(List<Integer> numbers, int test){

        List<Integer> numbersAux = new ArrayList<>(numbers);
        int i = 0;
        while(!numbersAux.isEmpty()){

            while (i >= numbersAux.size()) i -= numbersAux.size();

            if(numbersAux.remove(i) == 13 && numbersAux.isEmpty()) return true;

            i += test - 1;

        }

        return false;

    }

}