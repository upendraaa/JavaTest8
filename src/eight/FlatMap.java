package eight;
import java.util.Arrays;

    public class FlatMap {
        public static void main(String[] args) {
            int[][] matrix = {
                    {5, 3, 9},
                    {8, 1, 6},
                    {4, 7, 2}
            };

            int rows = matrix.length;
            int columns = matrix[0].length;

            int[] flattenedArray = Arrays.stream(matrix)
                    .flatMapToInt(Arrays::stream)
                    .sorted()
                    .toArray();

            System.out.println("Sorted Array:" + Arrays.toString(flattenedArray));
            for (int i = 0; i < rows * columns; i++) {
                System.out.print(flattenedArray[i] + " ");
            }
        }
    }


