package testc;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setId("1");
        employee1.setName("Name1");

        List<Employee> empList = Stream.generate(()->new Employee()).limit(3).collect(Collectors.toList());

        for (Employee emp:empList
             ) {

            emp.setId("123");
            emp.setName("Name");

        }


        for (Employee emp: empList
             ) {
            System.out.println(emp.getId() +","+emp.getName());
        }


    }
}
