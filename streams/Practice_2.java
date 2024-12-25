package streams;

import exam22Dec2024.Emp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

// 11 to 20 no questions
public class Practice_2 {
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

/*

        // 11. Find employees whose age is greater than 30 and less than 30.
        // using list
        List<Employee> Q11 = empList.stream().filter(a->(a.getAge()>30)).collect(Collectors.toList());
        System.out.println("List of employee whose age is greater than 30 is = \n"+Q11);
        List<Employee> Q11b = empList.stream().filter(a->a.getAge()<=30).toList();
        System.out.println("List of employee whose age is less than and equals to 30 is = \n"+Q11b);
        // using Collectors.partitionBy() method
        java.util.Map<Boolean,List<Employee>> Q11c = empList.stream().collect(Collectors.partitioningBy(a->a.getAge()>30));
        System.out.println("Using Collectors.partitioningBy() method List of employee whose age is less than 30 and less than  30 is = \n"+Q11c);

        //12. Find the department name which has the highest number of employees.
        Optional<Map.Entry<String, Long>> deptNo = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()))
                .entrySet().stream().sorted((a,b)-> -(Math.toIntExact((a.getValue() - b.getValue())))).findFirst();
        Map.Entry<String, Long> deptNo1 = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(deptNo1);

        //13. Find if there any employees from HR Department.
        List<Employee> hrDeptEmp = empList.stream().filter(a->a.getDeptName().equals("HR")).toList();
        System.out.println(hrDeptEmp);
        Optional<Employee> hrDeptEmp1 = empList.stream().filter(a->a.getDeptName().equalsIgnoreCase("hr")).findAny();
//        hrDeptEmp1.ifPresent(a-> System.out.println(a));
        System.out.println("\nusing optional foreach method....");
        hrDeptEmp1.ifPresent(a-> hrDeptEmp.forEach(System.out::println));
*/


        //15 . Find distinct department names that employees work for.
    }
}
