package Timer.Interfaces;

import java.util.function.Supplier;

public interface TimerInterface<T> {
    Supplier<Long> execAdd(); 
    Supplier<Long> execContains();
    Supplier<Long> execRemove();
    Supplier<Long> execClear();
    
    long avgExecTime(Supplier<Long> action);
}
