package Timer.Interfaces;

public interface TimerInterface<T> {
    Long execAdd(); 
    Long execContains();
    Long execRemove();
    Long execClear();
    
    long avgExecTime(String action);
}
