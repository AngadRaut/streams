package exam22Dec2024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySumElementCube {
    public static void main(String[] args) {
        Integer[] ar = {1,3,5,2,4,6};
        List<Integer> integerList = Arrays.asList(ar);
        Double sum = integerList.stream()
                .filter(a->a%2==0)
                .mapToDouble(a->(a*a*a))
                .sum();
        System.out.println(sum);

//        Double sum1 = integerList.stream().filter(a->a%2==0).map(a->(a*a*a)).collect(Collectors.summingDouble());
    }
}
