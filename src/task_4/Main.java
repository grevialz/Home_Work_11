package task_4;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Long> random = generateRandomStream(25214903917L, 11L, (long) Math.pow(2, 48));
        random.limit(15).forEach(System.out::println);
    }

    public static Stream<Long> generateRandomStream(long a, long c, long m) {
        return Stream.iterate(1L, n -> (a * n + c) % m);
    }
}
