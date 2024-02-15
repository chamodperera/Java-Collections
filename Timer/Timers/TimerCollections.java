package Timer.Timers;

import java.util.Collection;
import java.util.function.Supplier;

import Generator.utils.GeneratorUtils;
import Timer.Timer;

public class TimerCollections extends Timer<Collection<Integer>>{
    private Collection<Integer> collection;
    private Collection<Integer> tempCollection;

    public TimerCollections(int range, Collection<Integer> collection, Collection<Integer> tempCollection){
        super(range);
        this.collection = collection;
        this.tempCollection = tempCollection;
    }

    @Override
    public Supplier<Long> execAdd() {
        this.collection.clear();
        this.collection.addAll(this.tempCollection);

        return () ->{
            long startTime = System.nanoTime();
            this.collection.add(this.collection.size() + GeneratorUtils.randomInt(this.range));
            long endTime = System.nanoTime();

            return endTime - startTime;
        };
    }

    @Override
    public Supplier<Long>  execContains() {
        return () ->{
            long startTime = System.nanoTime();
            this.collection.contains(GeneratorUtils.randomInt(this.range));
            long endTime = System.nanoTime();

            return endTime - startTime;
        };
    }

    @Override
    public Supplier<Long>  execRemove() {
        this.collection.clear();
        this.collection.addAll(this.tempCollection);
        
        return () ->{
            long startTime = System.nanoTime();
            this.collection.remove(GeneratorUtils.randomInt(this.range));
            long endTime = System.nanoTime();

            return endTime - startTime;
        };
    }

    @Override
    public Supplier<Long> execClear() {
        return () ->{
            long startTime = System.nanoTime();
            this.collection.clear();
            long endTime = System.nanoTime();

            this.collection.addAll(this.tempCollection);

            return endTime - startTime;
        };
    }
  

}
