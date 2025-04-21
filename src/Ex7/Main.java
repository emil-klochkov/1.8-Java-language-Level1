package Ex7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "kiwi", "banana", "orange", "fig", "strawberry");

        SortLongestToShortest sorter = new SortLongestToShortest();
        List<String> result = sorter.apply(items);

        System.out.println("Sorted by length (long to short): " + result);
    }
}