import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    protected int min, max, numRandom;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        this.numRandom = random.nextInt((max - min) + 1) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int num = numRandom;

            @Override
            public boolean hasNext() {
                if (num == 100) {
                    return false;
                } else {
                    return true;
                }
            }

            @Override
            public Integer next() {
                if (num == 100) {
                    System.out.println("Выпало число 100, давайте на этом закончим");
                    return null;
                } else {
                    num = random.nextInt((max - min) + 1) + min;
                    return num;
                }
            }
        };
    }


}