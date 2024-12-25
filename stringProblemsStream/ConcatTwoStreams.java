package stringProblemsStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// 13. Write a Java 8 program to concatenate two Streams?
public class ConcatTwoStreams {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");
       Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println);

       Stream<String> c = Stream.concat(list1.stream(),list2.stream());
       c.forEach(a-> System.out.println(a));
    }
}
