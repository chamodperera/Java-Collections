package Generator.generators;

import java.util.Collection;
import Generator.RandomGenerator;

public class CollectionRandomGenerator extends RandomGenerator<Collection<Integer>> {
    private Collection<Integer> collection;

    public CollectionRandomGenerator(int length, int range, Collection<Integer> collection) {
        super(length, range);
        this.collection = collection;
    }

    @Override
    public void generate() {
        while (collection.size() < this.length) {
            this.collection.add(this.random.nextInt(this.range));
        }
    }

    @Override
    public Collection<Integer> getObject() {
        generate();
        return this.collection;
    }
}