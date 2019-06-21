import java.lang.reflect.Array;
import java.util.*;

public class WeekTwoChallenge {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
        Random rnd = new Random();

        //Rice toppings array
        List<String> riceList = Arrays.asList("none","white", "brown");
        ArrayList<String> riceIngred = new ArrayList<>();
        riceIngred.addAll(riceList);

        //Meat toppings array
        List<String> meatList = Arrays.asList("none","chicken", "steak", "carnidas","chorizo","sofritas","veggies");
        ArrayList<String> meatIngred = new ArrayList<>();
        meatIngred.addAll(meatList);

        //Beans toppings array
        List<String> beansList = Arrays.asList("none","pinto", "black");
        ArrayList<String> beansIngred = new ArrayList<>();
        beansIngred.addAll(beansList);

        //Salsa toppings array
        List<String> salsaList = Arrays.asList("none","mild", "medium","hot","all");
        ArrayList<String> salsaIngred = new ArrayList<>();
        salsaIngred.addAll(salsaList);

        //Veggies toppings array
        List<String> veggiesList = Arrays.asList("none","lettuce","fajita veggies","all");
        ArrayList<String> veggiesIngred = new ArrayList<>();
        veggiesIngred.addAll(veggiesList);

        for (int i = 0; i < 25; i++){

        }
    }

}

