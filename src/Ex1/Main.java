package Ex1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void Main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "banana", "mango", "kiwi", "strawberry");

        FilterWith0 filter = new FilterWith0();
        List<String> result = filter.apply(strings);

        System.out.println("Strings with 'o': " + result);
    }
}