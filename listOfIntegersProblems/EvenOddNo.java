package listOfIntegersProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Given a list of integers, find out all the even and odd numbers that exist in the list using Stream functions?

public class EvenOddNo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        System.out.println("list = "+list);
        List<Integer> even = list.stream().filter(a->a%2==0).toList();
        List<Integer> odd = list.stream().filter(a->a%2!=0).toList();
        System.out.println("even No = "+even);
        System.out.println("odd No = "+odd);

        // using Map.
        Map<Boolean,List<Integer>> evenOdd = list.stream().collect(Collectors.partitioningBy(a->a%2==0));
        System.out.println("odd and even no's = "+evenOdd);

    }
}
