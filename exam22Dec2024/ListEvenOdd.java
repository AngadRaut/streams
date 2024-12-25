package exam22Dec2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ListEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,6,7,8,9,89,43,23,45,65,67,78);
        System.out.println(list);
        // find the even and odd numbers
        List<Integer> evenUsingStream = list.stream().filter(a->a%2==0).toList();
        System.out.println("even using stream is = "+evenUsingStream);
        List<Integer> oddUsingStream = list.stream().filter(a->a%2!=0).toList();
        System.out.println("odd using stream is = "+oddUsingStream);
        System.out.println();

        // stream second way
        Set<Map.Entry<Boolean, List<Integer>>> secondWayEven = list.stream().collect(Collectors.partitioningBy(a->a%2==0)).entrySet();
        System.out.println("second way using partitioningBy"+secondWayEven);

        // using forEach loops
        System.out.println("even no's using forEach loop ");
        for(Integer i : list){
            if(i%2==0){
                System.out.println(i);
            }
        }
        System.out.println("odd no's using forEach loop ");
        for(Integer i : list){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        // using collections

    }
}
