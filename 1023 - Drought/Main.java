    import java.util.*;

    class Main {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int input;

            List<City> cities = new ArrayList<>();

            int index = 1;
            while ((input = sc.nextInt()) != 0) {

                City city = new City();

                city.amountOfProperties = input;
                city.index = index++;

                List<Property> properties = new ArrayList<>();

                for(int i = 0; i < input; i++){

                    Property property = new Property();
                    property.set(sc.nextInt(), sc.nextInt());
                    properties.add(property);

                }

                city.properties = properties;
                cities.add(city);

            }

            int k = 0;
            for(City city : cities){

                if(k++ != 0) System.out.println("\n");

                city.printLine1();
                city.printLine2();
                city.printLine3();


            }

        }

        public static class City{

            public void printLine1(){
                System.out.println("Cidade# "+index+":");
            }

            public void printLine2(){

                Map<Integer, Integer> groupConsumption = new TreeMap<>();

                for(Property p : properties){

                    if(groupConsumption.containsKey(p.average))
                        groupConsumption.put(p.average, p.numberOfResidents + groupConsumption.get(p.average));
                    else
                        groupConsumption.put(p.average, p.numberOfResidents);

                    totalConsumption += p.consumption;
                    totalPeople += p.numberOfResidents;

                }

                int i  = 0;
                for(Map.Entry<Integer, Integer> con : groupConsumption.entrySet()) {
                    if(i++ != 0) System.out.print(" ");
                    System.out.print(con.getValue() + "-" + con.getKey());
                }

            }

            public void printLine3(){

                System.out.print("\nConsumo medio: " +
                        String.format("%.2f", Math.floor((double)totalConsumption*100d/totalPeople)/100d)+
                " m3.");

            }

            public int totalConsumption = 0;
            public int totalPeople = 0;
            public int amountOfProperties;
            public int index;
            public List<Property> properties;

        }

        public static class Property {

            public int numberOfResidents;
            public int consumption;
            public int average;

            public void set(int numberOfResidents, int consumption){

                this.numberOfResidents = numberOfResidents;
                this.consumption = consumption;
                average = consumption / numberOfResidents;

            }

        }

    }