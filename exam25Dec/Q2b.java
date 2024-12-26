package exam25Dec;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// second way
public class Q2b {
    public static void main(String[] args) {
        Integer[] arr = {14, 0, 5, 2, 0, 3, 0};
        List<Integer> list = Arrays.asList(arr).stream().sorted().toList();
        System.out.println(list);

        Integer[] arr1 = {14, 0, 5, 2, 0, 3, 0};
        List<Integer> list1 = Arrays.asList(arr).stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list1);

    }
}
