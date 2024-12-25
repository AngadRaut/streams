package listOfIntegersProblems;


//15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortArrayConvertIntoStream {
    public static void main(String[] args) {
        int arr[] = { 99, 55, 203, 99, 4, 91 };
        List<Integer> integerStream = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
        System.out.println(integerStream);
    }
}
