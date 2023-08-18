package task_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "Jane", "John", "Kate");

        List<String> sortedUpperNames = sortAndUpperCase(names);

        System.out.println(sortedUpperNames);
    }

    public static List<String> sortAndUpperCase(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}