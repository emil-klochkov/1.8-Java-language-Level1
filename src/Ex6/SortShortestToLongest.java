package Ex6;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortShortestToLongest {
    public List<String> apply(List<String> inputList) {
        return inputList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
    }
}