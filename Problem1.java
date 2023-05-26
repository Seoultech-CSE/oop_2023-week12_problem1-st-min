import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Number> list = new ArrayList<>();
        System.out.print("Enter five integers and five doubles: ");

        for(int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }

        for(int i = 0; i < 5; i++) {
            list.add(input.nextDouble());
        }

        sort(list);

        for(Number i : list) {
            System.out.print(i + " ");
        }

    }

    public static void sort(ArrayList<Number>list) {

    for (int i = 0; i < list.size(); i++) {
        for (int j = i + 1; j < list.size(); j++) {
            if (list.get(i).doubleValue() > list.get(j).doubleValue()) {
                Number tmp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, tmp);
                }
            }
        }
    }

}
