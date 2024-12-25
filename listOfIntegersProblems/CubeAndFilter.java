package listOfIntegersProblems;

import java.util.Arrays;
import java.util.List;

// 14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
public class CubeAndFilter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().map(a->(a*a*a)).filter(a->(a>50)).forEach(System.out::println);
    }
}
