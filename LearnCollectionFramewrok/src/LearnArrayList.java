import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list); // This will create a array [1,2,3,4,5,6]

        list.add(7); // This will add 7 at the end of the array
        System.out.println(list);

        list.add(2,50);
        System.out.println(list);

        List<Integer> newList = new ArrayList<>();
        newList.add(300);
        newList.add(400);
        System.out.println(newList);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1));
    }
}
