package Generator.utils;

import java.util.Random;

public class GeneratorUtils {
    private static final Random random = new Random();

    public static int randomInt(int range) {
        return random.nextInt(range);
    }
}