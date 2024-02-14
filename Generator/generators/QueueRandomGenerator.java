package Generator.generators;


import java.util.Queue;
import Generator.RandomGenerator;

public class QueueRandomGenerator extends RandomGenerator<Queue<Integer>> {
    private Queue<Integer> queue;

    public QueueRandomGenerator(int length, int range, Queue<Integer> queue) {
        super(length, range);
        this.queue = queue;
    }

    @Override
    public void generate() {
        for (int i = 0; i < this.length; i++) {
            this.queue.add(random.nextInt(this.range));
        }
    }

    @Override
    public Queue<Integer> getObject() {
        generate();
        return this.queue;
    }
}
