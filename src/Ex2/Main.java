package Ex2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "orange", "banana", "mango", "kiwi", "strawberry", "chocolate");

        FilterWith0AndLength filter = new FilterWith0AndLength();
        List<String> result = filter.apply(strings);

        System.out.println("Strings with 'o' and more than 5 letters: " + result);
    }
}
