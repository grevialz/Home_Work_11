package task_3;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String sortedArray = sortNumbers(array);
        System.out.println(sortedArray);
    }

    public static String sortNumbers(String[] arr) {
        return Arrays.stream(arr)
                .flatMap(s -> Arrays.stream(s.split(", ")))
                .mapToInt(Integer::parseInt)
                .sorted()                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
