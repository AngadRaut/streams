package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 16. Find all employees who lives in "Blore" city, sort them by their name and print the names of employees.

public class BloreCityEmp {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020));
        empList.add(new Employee(10, "bch", 24, 13, "F", "HR", "Blore", 2021));

        empList.add(new Employee(11, "c", 28, 123, "F", "HR", "Blore", 2020));

        empList.add(new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "ijk", 22, 150, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "stv", 25, 160, "M", "IT", "Blore", 2010));

        empList.stream().filter(a->a.getCity().equalsIgnoreCase("blore"))
                .sorted((a,b)->a.getName().compareToIgnoreCase(b.getName())).forEach(System.out::println);

        // 17. No of employees in the organisation.
        Long no = empList.stream().count();
        System.out.println("total employees = "+no);
        // 18 18. Find employee count in every department
        Map<String,Long> empInDept = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        System.out.println(empInDept);

    }
}
