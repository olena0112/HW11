import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StringList {
    public static List<String> transformAndSort(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry", "date");
        List<String> transformedAndSorted = transformAndSort(strings);
        System.out.println(transformedAndSorted);
    }
}



