package listOfIntegersProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicates {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("original list = "+myList);
        List<Integer> myList1 = myList.stream().distinct().toList();
        System.out.println("after removing duplicates myList = "+myList1);

//        3. How to find duplicate elements in a given integers list in java using Stream functions?
        Set<Integer> set = new TreeSet<>();
      myList.stream().filter(a -> !set.add(a)).forEach(System.out::println);

    }
}
