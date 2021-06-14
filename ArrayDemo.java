/**
 * @author Donny (1972027)
 */

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo{
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Budi";
        names[1] = "Cynthia";
        names[2] = "Sinta";
        System.out.println(Arrays.toString(names));

        Integer[] numbers = (Integer[]) Array.newInstance(Integer.class, 3);
        Array.set(numbers, 0, 20);
        Array.set(numbers, 1, -10);
        Array.set(numbers, 2, 5);
        System.out.println(Array.toString(numbers));
    }
}
