package task_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String sortedArray = sortNumbers(array);
        System.out.println(sortedArray);
    }

    public static String sortNumbers(String[] arr) {

        String str = String.join(",", arr);

        String[] numbers = str.split(",");

        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i].trim());
        }

        Arrays.sort(intNumbers);

        return String.join(", ", Arrays.toString(intNumbers)
                .replaceAll("\\[|\\]|\\s", ""));
    }
}
