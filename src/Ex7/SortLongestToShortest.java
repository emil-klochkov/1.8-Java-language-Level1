package Ex7;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortLongestToShortest {
    public List<String> apply(List<String> inputList) {
        return inputList.stream()
                .sorted(Comparator.comparingInt(String::length).reversed())
                .collect(Collectors.toList());
    }
}