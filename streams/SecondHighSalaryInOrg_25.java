package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighSalaryInOrg_25 {
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

        // 25. Find Second Highest salary in the organisation.
        Optional<Employee> secondHighSalary = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(1).findFirst();
        System.out.println(secondHighSalary);

        // 25. Find Second smallest salary in the organisation.
        Optional<Employee> secondMinSalary = empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
                .skip(1).findFirst();
        System.out.println(secondMinSalary);

//        28. Find lowest paid salary in the organisation based in the organisation.
       Employee salary = empList.stream().min((a, b)-> Math.toIntExact(a.getSalary() - b.getSalary())).get();
        System.out.println(salary.getSalary());
    }
}
