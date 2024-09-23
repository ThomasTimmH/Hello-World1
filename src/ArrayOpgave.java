import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOpgave {
    public static void main(String[] args) {


        ArrayList<Integer> table1 = new ArrayList<>(
                Arrays.asList(2, 5, 7, 8, 11, 45, 23, 76, 34, 45, 44, 55, 77, 99, 2, 5));
ArrayList<Integer> table2 = new ArrayList<>();
        for (int number : table1){
            table2.add(number);
        }
        System.out.println(table2);


    }
}
