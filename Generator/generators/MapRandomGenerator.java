package Generator.generators;

import java.util.Map;
import Generator.RandomGenerator;

public class MapRandomGenerator extends RandomGenerator<Map<String, Integer>> {
    private Map<String, Integer> map;

    public MapRandomGenerator(int length, int range, Map<String, Integer> map) {
        super(length, range);
        this.map = map;
    }

    @Override
    public void generate() {
        for (int i = 0; i < this.length; i++) {
            this.map.put("value " + i, this.random.nextInt(this.range));
        }
    }

    @Override
    public Map<String, Integer> getObject() {
        generate();
        return this.map;
    }
}

