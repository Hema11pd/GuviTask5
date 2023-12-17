package GuviTask5;

import java.util.Arrays;
import java.util.List;


public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "", "jkl");

        List<String> nonEmptyStrings = strings.stream().filter(s -> !s.isEmpty()).toList();

        System.out.println("Actual given string" + strings);
        System.out.println("Result without empty " + nonEmptyStrings);
    }
}
