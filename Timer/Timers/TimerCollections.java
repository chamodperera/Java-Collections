package Timer.Timers;

import java.util.Collection;

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
    public Long execAdd() {
        this.collection.clear();
        this.collection.addAll(this.tempCollection);
        int element = this.collection.size() + GeneratorUtils.randomInt(this.range);

        
        long startTime = System.nanoTime();
        this.collection.add(element);
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    @Override
    public Long  execContains() {
        int element = GeneratorUtils.randomInt(this.range);

        long startTime = System.nanoTime();
        this.collection.contains(element);
        long endTime = System.nanoTime();

        return endTime - startTime;
        
    }

    @Override
    public Long execRemove() {
        this.collection.clear();
        this.collection.addAll(this.tempCollection);
        int element = GeneratorUtils.randomInt(this.range);
        
        
        long startTime = System.nanoTime();
        this.collection.remove(element);
        long endTime = System.nanoTime();

        return endTime - startTime;
        
    }

    @Override
    public Long execClear() {

        long startTime = System.nanoTime();
        this.collection.clear();
        long endTime = System.nanoTime();

        this.collection.addAll(this.tempCollection);

        return endTime - startTime;
    }
  

}
