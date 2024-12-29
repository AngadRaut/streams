package stringProblemsStream;

// 7. Given a String, find the first non-repeated character in it using Stream functions?

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Character ch = input.chars()   // stream of string
                .mapToObj(a-> Character.toLowerCase(Character.valueOf(char a)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting())) //
         .
    }
}
