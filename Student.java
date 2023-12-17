package GuviTask5;


import java.util.Arrays;
import java.util.List;


public class Student {
    public static void main(String[] args)
    {
        List<String> name = Arrays.asList("Hema","Ashwini","Preethi","Ash");
        List<String> streamName = name.stream().filter(input-> input.startsWith("A")).toList();
        System.out.println("Actual name in the list"+name);
        System.out.println("Output after filter :"+streamName);
    }
}
