package task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Ivan", "Peter", "Jane", "John", "Kate"));
        String indexedNames = getIndexedNames(names);
        System.out.println(indexedNames);
    }

    public static String getIndexedNames(List<String> names) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < names.size(); i += 2) {
            int index = i + 1;
            stringBuilder.append(index).append(". ").append(names.get(i));
            if (i < names.size() - 2) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}