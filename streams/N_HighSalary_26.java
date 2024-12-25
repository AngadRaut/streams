package streams;

//26. Nth Highest salary.

import exam22Dec2024.Emp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class N_HighSalary_26 {
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

        // find the nth highest salary
        int n = 3 ;
        List<Employee> sortBySalary = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary))
                .toList();
        System.out.println(sortBySalary);
        System.out.println();
        Optional<Employee> nHighSalary = empList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .skip(n-1).findFirst();
        if(nHighSalary.isPresent()){
            Employee employee = nHighSalary.get();
            long nthHighSalary = employee.getSalary();
            System.out.println(n+"th highest salary is = "+nthHighSalary);
        }
        System.out.println(nHighSalary);

    }
}
