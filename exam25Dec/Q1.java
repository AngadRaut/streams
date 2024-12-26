package exam25Dec;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Write a Java program to check whether one string is a rotation of another.
// For example, If “JavaJ2eeStrutsHibernate” is a string then some rotated versions of this
// string are “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava“, “HibernateJavaJ2eeStruts“

public class Q1 {
    public static void main(String[] args) {

        // third way
        String s1 = "JavaJ2eeStrutsHibernate";
        String s2 = "HibernateJavaJ2eeStruts";
        // converting it into set
        Set<String> set1 = Arrays.asList(s1.split("")).stream().filter(a->new HashSet<>().add(a)).collect(Collectors.toSet());
        Set<String> set2 = Arrays.asList(s2.split("")).stream().filter(a->new HashSet<>().add(a)).collect(Collectors.toSet());
        // checking the sets are equal or not
        if(set1.equals(set2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }



        // convert the strings into lists
        List<String> s3 = Arrays.asList(s1.split(""));
        List<String> s4 = Arrays.asList(s2.split(""));





        // sorting into natural order
        List<String> sort_s3 = s3.stream().sorted().toList();
        List<String> sort_s4 = s4.stream().sorted().toList();
        System.out.println(sort_s4);
        System.out.println(sort_s3);
        // checking they are equal or not
        if (sort_s3.equals(sort_s4)) {
            System.out.println("list s2 is part of list s1");
        } else {
            System.out.println("different");
        }

        // second way
        if (s1.length() == s2.length()) {
            Map<String, Long> m1 = s3.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            Map<String, Long> m2 = s4.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            if (m1.equals(m2)) {
                System.out.println("two strings are part of each other ...");
            }
        } else {
            System.out.println("string are not part of each other ");
        }
     /*   // third way
        String concat = s1.concat(s2);
        if (s1.length() == s2.length()) {
            if (concat.contains(s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }else {
            System.out.println("false");
        }*/

    }
}