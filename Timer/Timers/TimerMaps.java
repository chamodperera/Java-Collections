package Timer.Timers;

import java.util.Map;
import java.util.function.Supplier;

import Generator.utils.GeneratorUtils;
import Timer.Timer;

public class TimerMaps extends Timer<Map<Integer,Integer>>{
    private Map<Integer,Integer> map;
    private Map<Integer,Integer> tempMap;

    public TimerMaps(int range, Map<Integer,Integer> map, Map<Integer,Integer> tempMap){
        super(range);
        this.map = map;
        this.tempMap = tempMap;
    }

    @Override
    public Supplier<Long> execAdd() {
        this.map.clear();
        this.map.putAll(this.tempMap);

        return () -> {
            long startTime = System.nanoTime();
            this.map.put(this.map.size() + GeneratorUtils.randomInt(this.range), GeneratorUtils.randomInt(this.range));
            long endTime = System.nanoTime();

            return endTime - startTime;
        };
    }

    @Override
    public Supplier<Long> execContains() {
        return () -> {
            long startTime = System.nanoTime();
            this.map.containsKey(GeneratorUtils.randomInt(this.range));
            long endTime = System.nanoTime();

            return endTime - startTime;
        };
    }

    @Override
    public Supplier<Long> execRemove() {
        this.map.clear();
        this.map.putAll(this.tempMap);
        
        return () -> {
            long startTime = System.nanoTime();
            this.map.remove(GeneratorUtils.randomInt(this.range));
            long endTime = System.nanoTime();

            return endTime - startTime;
        };
    }

    @Override
    public Supplier<Long> execClear() {
        return () -> {
            long startTime = System.nanoTime();
            this.map.clear();
            long endTime = System.nanoTime();
            
            this.map.putAll(this.tempMap);

            return endTime - startTime;
        };
    }

    
}
