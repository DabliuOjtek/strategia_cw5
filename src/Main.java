import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SortContext sortContext = new SortContext();

        int[] array_1 = new int[21];
        int[] array_2 = new int[638];
        int[] array_3 = new int[3751];

        sortContext.setSort(new BubbleSort());

        sortContext.sortArray(array_1);
        sortContext.sortArray(array_2);
        sortContext.sortArray(array_3);

        sortContext.setSort(new SelectionSort());
        sortContext.sortArray(array_1);
        sortContext.sortArray(array_2);
        sortContext.sortArray(array_3);

        sortContext.setSort(new ArraySort());
        sortContext.sortArray(array_1);
        sortContext.sortArray(array_2);
        sortContext.sortArray(array_3);

        sortContext.setSort(new ParallelSort());
        sortContext.sortArray(array_1);
        sortContext.sortArray(array_2);
        sortContext.sortArray(array_3);

    }
}

