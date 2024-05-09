package eight;

import java.util.ArrayList;
import java.util.Optional;

@FunctionalInterface
public interface Average {

    Optional<Integer> calculate(ArrayList<Integer> inputs);

}
