package exam22Dec2024;

import java.util.*;
import java.util.stream.Collectors;

public class CharCount {
    public static void main(String[] args) {
        String str = "nanathdtditbs";
        char[] strArray = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        System.out.println(list);
        Map<Character,Long> map = list.stream().collect(Collectors.groupingBy(a->a,Collectors.counting()));
        System.out.println(map);
    }
}
