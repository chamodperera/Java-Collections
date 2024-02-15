package Timer.Timers;

import java.util.Collection;
import Generator.utils.GeneratorUtils;
import Timer.Timer;

public class TimerCollections extends Timer<Collection<Integer>>{
    private Collection<Integer> collection;

    public TimerCollections(int range, Collection<Integer> collection){
        super(range);
        this.collection = collection;
    }

    @Override
    public Runnable execAdd() {
        return () -> {
            this.collection.add(this.collection.size() + GeneratorUtils.randomInt(this.range)); // Adjust as needed for actual implementation
        };
    }
    
}
