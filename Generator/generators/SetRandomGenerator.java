package Generator.generators;

import java.util.Set;
import Generator.RandomGenerator;

public class SetRandomGenerator extends RandomGenerator<Set<Integer>> {
    private Set<Integer> set;

    public SetRandomGenerator(int length, int range, Set<Integer> set) {
        super(length, range);
        this.set = set;
    }

    @Override
    public void generate() {
        while (set.size() < this.length) {
            this.set.add(random.nextInt(this.range));
        }
    }

    @Override
    public Set<Integer> getObject() {
        generate();
        return this.set;
    }
}