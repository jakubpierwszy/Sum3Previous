import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculate(8));

    }

    public static int calculate(int index) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        int x = 0, y = 1, z = 2;
        int sum;

        while (list.size() < index) {
            sum = x + y + z;
            if (sum == x + y + z) {
                x = y;
                y = z;
                z = sum;
                list.add(sum);
            }
        }
        return list.get(index - 1);
    }
}