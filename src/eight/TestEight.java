package eight;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.LongStream;

public class TestEight {

    public static void main(String[] args) {

        Area area = (i, j) -> i*j;
        System.out.println(area.calculate(23,45));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(64);
        list.add(78);

        Average average = (list1) -> {
            int sum = 0;
            for(Integer integer: list1){
                sum = sum+integer;
            }
            return Optional.of(sum / list1.size());
        };
        System.out.println(average.calculate(list).get());
        factorial();
        average();
    }

    public static void factorial(){
        int num =5;
       Long value = LongStream.rangeClosed(1,num).reduce(1,(a,b)->a*b);
        System.out.println(String.format("Factorial of %d is %d ",10,value));
    }

    static void average(){
        int num =10;
        OptionalDouble average = LongStream.rangeClosed(1,10).average();

        System.out.println(String.format("Average of series %d is %f",num,average.getAsDouble()));
    }


}
