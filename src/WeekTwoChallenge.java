import java.lang.reflect.Array;
import java.util.*;

public class WeekTwoChallenge {
    Scanner key = new Scanner(System.in);
    Random rnd = new Random();

    private static double price = 0;

    //Rice toppings array
    List<String> riceList = Arrays.asList("none", "white", "brown");
    ArrayList<String> riceIngred = new ArrayList<>();
    riceIngred.addAll(riceList);

    public static void main(String[] args) {
//        Scanner key = new Scanner(System.in);             ***Can delete
//        Random rnd = new Random();                        ***Can delete

//        //Rice toppings array
//        List<String> riceList = Arrays.asList("none", "white", "brown");
//        ArrayList<String> riceIngred = new ArrayList<>();
//        riceIngred.addAll(riceList);

//        //Meat toppings array
//        List<String> meatList = Arrays.asList("none", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies");
//        ArrayList<String> meatIngred = new ArrayList<>();
//        meatIngred.addAll(meatList);

        //Beans toppings array
        List<String> beansList = Arrays.asList("none", "pinto", "black");
        ArrayList<String> beansIngred = new ArrayList<>();
        beansIngred.addAll(beansList);

        //Salsa toppings array
        List<String> salsaList = Arrays.asList("none", "mild", "medium", "hot", "all");
        ArrayList<String> salsaIngred = new ArrayList<>();
        salsaIngred.addAll(salsaList);

        //Veggies toppings array
        List<String> veggiesList = Arrays.asList("none", "lettuce", "fajita veggies", "all");
        ArrayList<String> veggiesIngred = new ArrayList<>();
        veggiesIngred.addAll(veggiesList);


//        System.out.println(Arrays.asList(riceIngred));                //*****Can delete
//        System.out.println(Arrays.asList(meatIngred));
//        System.out.println(Arrays.asList(beansIngred));
//        System.out.println(Arrays.asList(salsaIngred));
//        System.out.println(Arrays.asList(veggiesIngred));






        }

    public static void riceIngred (int index){
//        Random rnd = new Random();
//        int index = rnd.nextInt((3)+1);         //Random number to generate index number of riceIngred list
//        System.out.println(index);


        //Rice toppings array
        List<String> riceList = Arrays.asList("none", "white", "brown");
        ArrayList<String> riceIngred = new ArrayList<>();
        riceIngred.addAll(riceList);

        String riceType = riceIngred.get(index);
        System.out.println(riceType);

        if (riceType.equalsIgnoreCase(riceList.get(1)) || riceType.equalsIgnoreCase(riceList.get(2))){
            price += 0.5;
        }


        }

    public static void meatIngred (int index){
//        Random rnd = new Random();
//        int index = rnd.nextInt((3)+1);         //Random number to generate index number of riceIngred list
//        System.out.println(index);


        //Meat toppings array
        List<String> meatList = Arrays.asList("none", "chicken", "steak", "carnidas", "chorizo", "sofritas", "veggies");
        ArrayList<String> meatIngred = new ArrayList<>();
        meatIngred.addAll(meatList);

        String meatType = meatIngred.get(index);
        System.out.println(meatType);

        if (meatType.equalsIgnoreCase(meatList.get(0))) {
            ;
        } else{
            price += 0.5;
        }
    }
}
}



