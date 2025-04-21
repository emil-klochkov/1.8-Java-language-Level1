package Ex3;

import java.util.List;

public class PrintWithLambda {
    public void apply(List<String> list) {
        list.forEach(month -> System.out.println(month));
    }
}