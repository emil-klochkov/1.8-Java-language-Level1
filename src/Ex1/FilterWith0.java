package Ex1;

import java.util.List;
import java.util.stream.Collectors;

public class FilterWith0 {
    public List<String> apply(List<String> inputList) {
        return inputList.stream()
                .filter(s -> s.contains("o"))
                .collect(Collectors.toList());
    }
}