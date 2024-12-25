package streams;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeEmployee {
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

        // 1.Group the Employees by city.
        // 2. group the Employees by age.
        Map<String,List<Employee>> groupByCityName = empList.stream().collect(Collectors.groupingBy(Employee::getCity));
        System.out.println("group by city : "+groupByCityName);

        // 3. Find the count of male and female employees present in the organization.
        Map<String,Long> countMaleFemale = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println("male and female count is = "+countMaleFemale);

        //4. Print the names of all departments in the organization.
        List<String> departments = empList.stream().map(Employee::getDeptName).distinct().toList();
        System.out.println("departments in organization are = "+departments);

        // 5. Print employee details whose age is greater than 28.
        List<Employee> ageGreaterThan28 = empList.stream().filter(a->a.getAge()>28).toList();
        System.out.println(ageGreaterThan28);

        // 6. Find details of employee having maximum age .
        Employee employee = empList.stream().max((a, b) -> a.getAge()-b.getAge()).get();
        System.out.println("employee having max age is = "+employee);
        // 6.1 Find maximum age of employee.
        int max = empList.stream().map(Employee::getAge).max((Integer::compareTo)).get();
        System.out.println("maximum age = "+max);

        // 7. Print Average age of Male and Female Employees.
        Map<String,Double> avgAgeByGender = empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
        System.out.println("average age of male and female emp is = "+avgAgeByGender);

        // 8. Print the number of employees in each department.
        Map<String,Long> noOfEmpInDep = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,Collectors.counting()));
        System.out.println(noOfEmpInDep);

        // 9. Find oldest employee.
        Optional<Employee> oldestEmployee = Optional.of(empList.stream().max((a, b) -> a.getAge() - b.getAge()).get());
//        Optional<Employee> oldestEmployee1 = Optional.of(empList.stream().max(Comparator.comparingInt(Employee::getAge)).get());
        System.out.println("oldest employee = "+oldestEmployee);

        // 10. Find youngest female employee.
        Employee youngestEmployee = empList.stream().filter(a->a.getGender().equals("F")).max((a,b)->b.getAge()-a.getAge()).get();
        System.out.println("youngest employee = "+youngestEmployee);


    }
}
