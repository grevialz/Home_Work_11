package task_5;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> secondStream = Stream.of(6, 7, 8,9,10, 11);

        Stream<Integer> zippedStream = zip(firstStream, secondStream);

        zippedStream.forEach(System.out::println);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream.Builder<T> builder = Stream.builder();

        Stream.concat(first, second)
                .forEach(builder::add);

        return builder.build();
    }
}