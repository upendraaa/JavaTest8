package eight;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamStart {

    List<Product> initializeProductListOfSize(int n){
        return Stream.generate(()-> new Product()).limit(n).collect(Collectors.toList());
    }

    List<Integer> initialiseIntegerList(int n){

        return IntStream.rangeClosed(1,n).boxed().collect(Collectors.toList());
    }

    List<Long> intializeLongList(int n){

        return LongStream.rangeClosed(1,n).boxed().collect(Collectors.toList());
    }

}
