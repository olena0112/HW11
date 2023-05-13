import java.util.stream.Stream;

public class RandomNumberGenerator {
    public static Stream<Long> generateRandomNumbers(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomStream = generateRandomNumbers(a, c, m, 1L);
        randomStream.limit(10).forEach(System.out::println);
    }
}

