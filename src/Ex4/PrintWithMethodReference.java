package Ex4;

import java.util.List;

public class PrintWithMethodReference {
    public void apply(List<String> list) {
        list.forEach(System.out::println);
    }
}