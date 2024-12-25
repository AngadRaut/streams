package stringProblemsStream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachChar {
    public static void main(String[] args) {
     String s = "string data to count each character";
     Map<String,Long> map = Arrays.stream(s.split(""))
             .map(a->a.toLowerCase())
             .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
    }
}
