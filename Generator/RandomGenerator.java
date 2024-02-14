package Generator;

import java.util.Random;
import Generator.Interfaces.GeneratorInterface;

public abstract class RandomGenerator<T> implements GeneratorInterface<T> {
    protected int length;
    protected int range;
    protected Random random = new Random();

    public RandomGenerator(int length, int range) {
        this.length = length;
        this.range = range;
    }
}
