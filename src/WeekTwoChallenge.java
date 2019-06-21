import java.lang.reflect.Array;
import java.util.*;

public class WeekTwoChallenge {
    Scanner key = new Scanner(System.in);
    private static Random rnd = new Random();


    private static double price = 3.00;


    public static void main(String[] args) {


        double totalPrice = 0.00;

        for (int i = 0; i < 25; i++) {
            System.out.print("\nBurrito " + (i+1) + ": ");

            //Rice type generator
            int randomNumberRice = rnd.nextInt(3);
            riceIngredType(randomNumberRice);

            //Meat type generator
            int randomNumberMeat = rnd.nextInt(6);
            meatIngredType(randomNumberMeat);

            //Beans type generator
            int randomNumberBeans = rnd.nextInt(3);
            beansIngredType(randomNumberBeans);

            //Salsa type generator
            int randomNumberSalsa = rnd.nextInt(5);
            salsaIngredType(randomNumberSalsa);

            //Veggies type generator
            int randomNumberVeggies = rnd.nextInt(4);
            veggiesIngredType(randomNumberVeggies);

            System.out.printf("\nTotal with 6%% tax: %.2f",(price + (price * .06)));
            price = 3.00;

        }

    }


    private static void riceIngredType (int index){                                      //Rice ingredient generator

        //Rice toppings array
        List<String> riceList = Arrays.asList("no rice", "white rice", "brown rice");
        ArrayList<String> riceIngred = new ArrayList<>();
        riceIngred.addAll(riceList);

        String riceType = riceIngred.get(index);

        System.out.print(riceType + ", ");

        if (riceType.equalsIgnoreCase(riceList.get(1)) || riceType.equalsIgnoreCase(riceList.get(2))){
            price += 0.5;
        }

        }

    private static void meatIngredType (int index){

        //Meat toppings array
        List<String> meatList = Arrays.asList("no meat", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies");
        ArrayList<String> meatIngred = new ArrayList<>();
        meatIngred.addAll(meatList);

        String meatType = meatIngred.get(index);

        System.out.print(meatType + ", ");

        if (meatType.equalsIgnoreCase(meatList.get(0))) {
            ;
        } else{
            price += 0.5;
        }
    }

    private static void beansIngredType (int index){

        //Beans toppings array
        List<String> beansList = Arrays.asList("no beans", "pinto beans", "black beans");
        ArrayList<String> beansIngred = new ArrayList<>();
        beansIngred.addAll(beansList);

        String beansType = beansIngred.get(index);

        System.out.print(beansType + ", ");

        if (beansType.equalsIgnoreCase(beansList.get(0))) {
            ;
        } else{
            price += 0.5;
        }
    }

    private static void salsaIngredType (int index){

        //Salsa toppings array
        List<String> salsaList = Arrays.asList("no sauce", "mild sauce", "medium sauce", "hot sauce", "all");
        ArrayList<String> salsaIngred = new ArrayList<>();
        salsaIngred.addAll(salsaList);

        String salsaType = salsaIngred.get(index);

        if (salsaType.equalsIgnoreCase("all")){
           salsaType = "combination sauce";
        }
        System.out.print(salsaType + ", ");

        if (salsaType.equalsIgnoreCase(salsaList.get(0))) {
            ;
        } else{
            price += 0.5;
        }
    }

    private static void veggiesIngredType (int index){

        //Veggies toppings array
        List<String> veggiesList = Arrays.asList("no veggies", "lettuce", "fajita veggies", "all veggies");
        ArrayList<String> veggiesIngred = new ArrayList<>();
        veggiesIngred.addAll(veggiesList);

        String veggiesType = veggiesIngred.get(index);

        System.out.print(veggiesType + ", ");

        if (veggiesType.equalsIgnoreCase(veggiesList.get(0))) {
            ;
        } else{
            price += 0.5;
        }
    }


}




