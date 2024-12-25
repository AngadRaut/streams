package exam22Dec2024;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // first way
        list.stream().map(a->a+a).forEach(System.out::println);

        //  second way
        List<Integer> list2 = new ArrayList<>();
        int a = 0 ;
        for (Integer i : list){
            a = i+i;
            list2.add(a);
        }
        System.out.println(list2);
    }
}