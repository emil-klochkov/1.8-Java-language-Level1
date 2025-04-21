package Ex2;

import java.util.List;
import java.util.stream.Collectors;

public class FilterWith0AndLength {
    public List<String> apply(List<String> inputList) {
        return inputList.stream()
                .filter(s -> s.contains("o") && s.length() > 5)
                .collect(Collectors.toList());
    }
}
