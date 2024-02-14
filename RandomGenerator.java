import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class RandomGenerator {
    private int length;
    private int range;
    private Collection<Integer> collectionObject;
    private Map<String, Integer> mapObject;

    private RandomGenerator(int length, int range) {
        this.length = length;
        this.range = range;
    }

    public RandomGenerator(int length, int range, List<Integer> collectionObject) {
        this(length, range);
        this.collectionObject = collectionObject;
        listGenerator();
    }

    public RandomGenerator(int length, int range, Set<Integer> collectionObject) {
        this(length, range);
        this.collectionObject = collectionObject;
        setGenerator();
    }

    public RandomGenerator(int length, int range, Queue<Integer> collectionObject) {
        this(length, range);
        this.collectionObject = collectionObject;
        listGenerator();
    }

    public RandomGenerator(int length, int range, Map<String,Integer> mapObject) {
        this(length, range);
        this.mapObject = mapObject;
        mapGenerator();
    }

    private void listGenerator() {
        Random random = new Random(); // Create a Random object for generating random numbers

        for (int i = 0; i < this.length; i++) {
            this.collectionObject.add(random.nextInt(this.range));
        }

    }

    private void setGenerator() { 
        for (int i = 0; i < this.length; i++) { //
            this.collectionObject.add(i);
        }

    }

    private void mapGenerator(){
        Random random = new Random();

        for (int i = 0; i < this.length; i++) {
            this.mapObject.put("value "+i,random.nextInt(this.range));
        }
    }

    public Object getObject() {
        if (collectionObject != null) {
            return collectionObject;
        } else if (mapObject != null) {
            return mapObject;
        }
        return null; // Or throw an exception if neither is initialized
    }

    public static int randomInt(int range) {
        Random random = new Random();
        return random.nextInt(range);
    }

}
