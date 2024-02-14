package Generator.generators;

import java.util.List;
import Generator.RandomGenerator;

public class ListRandomGenerator extends RandomGenerator<List<Integer>> {
    private List<Integer> list;

    public ListRandomGenerator(int length, int range, List<Integer> list) {
        super(length, range);
        this.list = list;
        
    }

    @Override
    public void generate() {
        for (int i = 0; i < this.length; i++) {
            this.list.add(random.nextInt(this.range));
        }
    }

    @Override
    public List<Integer> getObject() {
        generate();
        return this.list;
    }
}
