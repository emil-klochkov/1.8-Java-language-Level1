package Ex6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "kiwi", "banana", "orange", "fig", "strawberry");

        SortShortestToLongest sorter = new SortShortestToLongest();
        List<String> result = sorter.apply(items);

        System.out.println("Sorted by length (short to long): " + result);
    }
}