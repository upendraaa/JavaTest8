package eight;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class person{

    int id;
    long salary;
    String name;
    double age;

    public person(int id, long salary,String name,double age){
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

        person p = new person(1,12000,"Mercury",12);
        person p1 = new person(1,23000,"Venus",23);
        person p2 = new person(3,34000,"Earth",34);
        person p3 = new person(4,45000,"Mars",45);

        List<person> list = List.of(p,p1,p2,p3);

        list.stream().map(e -> e.salary *100).collect(Collectors.toList()).forEach(
                e -> System.out.println(e)
        );

        Long sum = list.stream().map(e -> e.salary).mapToLong(Long::longValue).sum();

         list.stream().filter(e-> e.salary > 12000).forEach(e -> System.out.println(e.name));

        System.out.println("Sum of salaries :" + sum);
    }


}
