package listOfIntegersProblems;

import java.util.Arrays;
import java.util.List;

//2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?

public class NoStartWith1FromList {
    public static void main(String[] args) {
        // declaring an list
        List<Integer> list  = Arrays.asList(11,45,67,91,23,31,41,56,90,17);
        System.out.println("list = "+list);

        list.stream().map(a->a+"").filter(a->a.startsWith("1")).forEach(System.out::println);

        int[] arr = {11,15,16,66,55,43,21,31,66};
        System.out.println("arr[] array = "+Arrays.toString(arr));
        Arrays.stream(arr).boxed().map(a->a+"").filter(a->a.startsWith("1")).forEach(System.out::println);
    }
}
