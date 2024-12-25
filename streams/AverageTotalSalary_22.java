package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class AverageTotalSalary_22 {
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

        // 22. Print average and total salary of the organization.
        Double total = empList.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println("total = "+total);
        OptionalDouble average = empList.stream().mapToDouble(Employee::getSalary).average();
        System.out.println("average = "+average);

        // second method
        Double salaryTotal = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum();
        System.out.println(salaryTotal);
        Double salaryAverage = empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getMax();
        System.out.println(salaryAverage);

    }
}
