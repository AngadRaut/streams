package exam22Dec2024;


import java.util.ArrayList;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(8);
        list1.add(3);
        list1.add(67);
        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(90);
        list2.add(3);
        list2.add(4);
        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        System.out.println(list1+"\n"+list2+"\n"+list3);
        System.out.println(list3);
        List<Integer> list = new ArrayList<>(list1);
       list.retainAll(list2);
       list.retainAll(list3);
        System.out.println(list);
    }
}
