package Generator.generators;

import java.util.Map;
import Generator.RandomGenerator;

public class MapRandomGenerator extends RandomGenerator<Map<Integer, Integer>> {
    private Map<Integer, Integer> map;

    public MapRandomGenerator(int length, int range, Map<Integer, Integer> map) {
        super(length, range);
        this.map = map;
    }

    @Override
    public void generate() {
        for (int i = 0; i < this.length; i++) {
            this.map.put(i, this.random.nextInt(this.range));
        }
    }

    @Override
    public Map<Integer, Integer> getObject() {
        generate();
        return this.map;
    }
}

