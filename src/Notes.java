import java.util.*;

public class Notes {
    public static void main (String[] args){

        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        for (int i = 0; i < 4; i++) {
            List<Integer> list = new ArrayList<>(2);
            list.add(1);
            list.add(2);
            list.add(3);
            lists.add(list);
        }
        System.out.println(lists.toString());

    }
}
