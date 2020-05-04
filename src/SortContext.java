import java.util.Random;

public class SortContext {
    private SortStrategy sortStrategy;
    Random random = new Random();

    public void setSort(SortStrategy s){
        sortStrategy = s;
    }
    public void sortArray(int[] array){
        long avgTime = 0;
        for(int i=0; i<10; i++){
            for (int j = 0; j < array.length; j++) {
                array[j] = random.nextInt();
            }

        long start = System.nanoTime();
        sortStrategy.sortMetod(array);
        long elapsedTime = System.nanoTime() - start;
        avgTime += elapsedTime;

        }
        System.out.println(sortStrategy.getClass().getName()+", average sorting time (milliseconds): " +(avgTime/10));
    }
}

