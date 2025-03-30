package Arrays;

public class ArrayTraversal {

    public static void main(String[] args) {
        int[] ages = new int[4];
        ages[0] = 34;
        ages[1] = 46;
        ages[2] = 53;
        ages[3] = 24;
        for (int age: ages)
        {
            System.out.print(age + " ");
        }
    }
}
