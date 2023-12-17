package GuviTask5;

import java.util.List;
import java.util.stream.Stream;

public class StreamUpperCase {
    public static void main(String[] args) {

        Stream<String> names = Stream.of("aBc", "d", "ef");


        List<String> uppercaseNames = names.map(String::toUpperCase).toList();


        System.out.println("Original: " + List.of("aBc", "d", "ef"));
        System.out.println("Uppercase : " + uppercaseNames);
    }
}
