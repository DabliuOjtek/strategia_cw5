import java.util.Arrays;

public class ParallelSort implements SortStrategy {
    @Override
    public void sortMetod(int[] array) {
        Arrays.parallelSort(array);
    }
}
