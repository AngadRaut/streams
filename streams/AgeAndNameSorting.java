package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// 20. Sorting a Stream by age and name fields.


public class AgeAndNameSorting {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

        // sort by name
        List<Employee> sortByName = empList.stream()
                .sorted((a,b)->a.getName().compareToIgnoreCase(b.getName()))
                .toList();
        System.out.println(sortByName);

        // sort by age
        System.out.println("sort by age");
        List<Employee> sortByAge = empList.stream()
                .sorted((a,b)->(a.getAge()-b.getAge()))
                .toList();
        System.out.println(sortByAge);

        System.out.println("Sorting based on name and age:: ");
        Comparator<Employee> comparator1 = Comparator.comparing(Employee::getName);
        Comparator<Employee> comparator2 = Comparator.comparingInt(Employee::getAge);
        empList.stream().sorted(comparator1.thenComparing(comparator2)).forEach(System.out::println);

    }
}
