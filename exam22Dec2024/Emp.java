package exam22Dec2024;

import java.util.*;
import java.util.stream.Collectors;

public class Emp {
    int age ;
    String name;

    public Emp() {
    }

    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }

    public Emp(int age, String name, Double salary, String gender) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    Double salary ;
    String gender;

    public static void main(String[] args) {
        List<Emp> list = new ArrayList<>();
        list.add(new Emp(11,"nana",60000.00,"male"));
        list.add(new Emp(43,"savita",25000.00,"female"));
        list.add(new Emp(24,"raina",50000.00,"male"));
        list.add(new Emp(56,"shardul",25000.00,"male"));
        list.add(new Emp(22,"gita",60000.00,"female"));

        list.add(new Emp(32,"savita",25000.00,"female"));
        list.add(new Emp(12,"raina",50000.00,"male"));
        list.add(new Emp(2,"shardul",25000.00,"male"));
        list.add(new Emp(8,"gita",60000.00,"female"));
        System.out.println(list+"\n");
        List<Emp> sortedByAge = list.stream().sorted((a,b)->a.getAge()-b.getAge()).toList();
        System.out.println("sort by age = "+sortedByAge+"\n");

        // sort by emp length
        List<Emp> sortByNameLength = list.stream()
                .sorted((a, b)->a.getName().length()-b.getName().length()).toList();
        System.out.println("sort By Name's Length = "+sortByNameLength+"\n");

        // sort by length alphabetically
        List<Emp> sortedByName = list.stream().sorted((a,b)->a.getName().compareTo(b.getName())).toList();
        System.out.println("sort by name in alphabetical = "+sortedByName+"\n");

        // map
        Map<Integer,Emp> empMap = new HashMap<>();
        empMap.put(1,new Emp(11,"nana",60000.00,"male"));
        empMap.put(2,new Emp(43,"savita",25000.00,"female"));
        empMap.put(3,new Emp(24,"raina",50000.00,"male"));
        empMap.put(4,new Emp(56,"shardul",25000.00,"male"));
        empMap.put(5,new Emp(22,"gita",60000.00,"female"));
        System.out.println(empMap);

        List<Map.Entry<Integer, Emp>> sortByName = empMap.entrySet().stream()
                .sorted((a, b) -> a.getValue().getName().compareToIgnoreCase(b.getValue().getName()))
                .toList();
        System.out.println("sort by name = "+sortByName);
/*        List<Map.Entry<Integer,Emp>> sortByNameSalary = empMap.entrySet().stream()
                .sorted()
        */
      /*  // empMap sort by length
        Set<Map.Entry<Integer,Emp>> sorMaptByName = empMap.entrySet().stream()
                .sorted((a,b)->a.getValue().getName().compareToIgnoreCase(b.getValue().getName())).collect(Collectors.toSet());
        System.out.println("sort by name  = "+sorMaptByName);
//                .sorted((a,b)->((a.getValue().getName()).compareTo((b.getValue().getName()));

        */

    }
}
