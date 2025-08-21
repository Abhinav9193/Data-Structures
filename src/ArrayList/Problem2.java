package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(3);
        l.add(4);
        l.add(6);
        l.add(3);

        System.out.println(l.get(2));
    }
}
