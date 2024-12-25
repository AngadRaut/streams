package stringProblemsStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

//20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
public class OptionalClassProblem {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7,9,0,67,8,4);
        System.out.println("integer list  = "+integers);
    }
}
