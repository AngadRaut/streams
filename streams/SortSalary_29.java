package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//29. Sort the employees salary in the organisation in ascending order
//33. Sort the employees salary in each department in ascending order


public class SortSalary_29 {
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

        List<Employee> sortBySalary = empList.stream().sorted((a,b)->Math.toIntExact(a.getSalary()-b.getSalary())).toList();
        System.out.println(sortBySalary);
        // sort by using forEach method
        empList.stream().map(Employee::getSalary).sorted().forEach(System.out::println);

//        30. Sort the employees salary in the organisation in descending order.
        List<Employee> sortBySalaryDesc = empList.stream().sorted((a,b)->Math.toIntExact(b.getSalary()-a.getSalary())).toList();
        System.out.println("emp salary sorted in descending order = "+sortBySalaryDesc);
        // sort by using forEach method
        empList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).forEach(System.out::println);

        //33. Sort the employees salary in each department in ascending order
        System.out.println("\nemp salary sorted in descending order :");

    }
}
