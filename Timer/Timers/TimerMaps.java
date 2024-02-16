package Timer.Timers;

import java.util.Map;

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
    public Long execAdd() {
        this.map.clear();
        this.map.putAll(this.tempMap);
        int key = this.map.size() + GeneratorUtils.randomInt(this.range);
        int value = GeneratorUtils.randomInt(this.range);

        
        long startTime = System.nanoTime();
        this.map.put(key, value);
        long endTime = System.nanoTime();

        return endTime - startTime;
        
    }

    @Override
    public Long execContains() {
        int value = GeneratorUtils.randomInt(this.range);

        long startTime = System.nanoTime();
        this.map.containsValue(value);
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    @Override
    public Long execRemove() {
        this.map.clear();
        this.map.putAll(this.tempMap);
        int element = GeneratorUtils.randomInt(this.range);
       
        long startTime = System.nanoTime();
        this.map.remove(element);
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    @Override
    public Long execClear() {

        long startTime = System.nanoTime();
        this.map.clear();
        long endTime = System.nanoTime();
        
        this.map.putAll(this.tempMap);

        return endTime - startTime;
    }

    
}
