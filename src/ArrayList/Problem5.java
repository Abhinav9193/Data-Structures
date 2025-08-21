package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(10);
        l.add(3);
        l.add(5);
        l.add(22);
        l.add(10);

        System.out.println("Original List: " + l);

        System.out.println("Reversed List: ");
        for (int i = l.size()-1;i>=0;i--)
        {
            System.out.print(l.get(i) + " ");
        }
    }
}
