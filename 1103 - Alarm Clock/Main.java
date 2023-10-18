import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

class Main {

    static SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        for(Time time = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
            !time.isDone();
            time = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt())){

            System.out.println(time.getMinutes());

        }

    }

    private record Time(int h1, int m1, int h2, int m2){
        public boolean isDone(){
            return h1 + m1 + h2 + m2 == 0;
        }
        public long getMinutes() throws ParseException {

            Date d1 = sdf.parse(h1+":"+m1);
            Date d2 = sdf.parse(h2+":"+m2);

            if(d1.compareTo(d2) > 0) d2 = Date.from(d2.toInstant().plus(1, ChronoUnit.DAYS));

            return ((d2.getTime() - d1.getTime()) / 60000);
        }
    }

}