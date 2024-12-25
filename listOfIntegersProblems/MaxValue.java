package listOfIntegersProblems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 6. Given a list of integers, find the maximum value element present in it using Stream functions?
public class MaxValue {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
    }
}
