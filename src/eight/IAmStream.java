package eight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person {

    int id;
    long salary;
    String name;
    double age;

    public Person(int id, long salary, String name, double age){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.age = age;
    }
}


public class IAmStream {

    public void findMax(){
        Integer[] array = {23,1,34,52,65,89};
        Integer max = Stream.of(array).max(Integer::compareTo).get();
        System.out.println(max);

    }

    public void calculateSum(){
        Integer[] array = {23,1,2,5,23,54,32,90};
        Integer sum = Stream.of(array).mapToInt(i-> i).sum();
        System.out.println("sum = "+sum);
    }

    public void getMaxAge(){

        Person p = new Person(1,12000,"Mercury",12);
        Person p1 = new Person(1,23000,"Venus",23);
        Person p2 = new Person(3,34000,"Earth",34);
        Person p3 = new Person(4,45000,"Mars",45);

        List<Person> list = List.of(p,p1,p2,p3);

        list.stream().map(e -> e.salary *100).collect(Collectors.toList()).forEach(
                e -> System.out.println(e)
        );

        Long sum = list.stream().map(e -> e.salary).mapToLong(Long::longValue).sum();

         list.stream().filter(e-> e.salary > 12000).forEach(e -> System.out.println(e.name));

        System.out.println("Sum of salaries :" + sum);

        System.out.println("Sum of even numbers: " + parallelSum);

    }

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    int parallelSum = numbers.parallelStream()
            .filter(num -> num % 2 == 0)  // Filtering even numbers
            .mapToInt(Integer::intValue)  // Converting to primitive int
            .sum();                        // Calculating the sum




}
