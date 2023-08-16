import java.util.Set;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
      List<String> list = List.of("AAA", "BBB", "CCC", "DDD");
      System.out.println(list);
      Set<Integer> set = Set.of(10,20,30,40,50,60);
      System.out.println(set);
      set.add(50);
    }
}
