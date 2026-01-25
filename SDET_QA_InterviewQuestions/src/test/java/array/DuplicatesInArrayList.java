package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicatesInArrayList {
	
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(1, 2, 3, 2, 4, 3, 5)
        );

        LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
        ArrayList<Integer> result = new ArrayList<>(set);

        System.out.println(result);
    }
}