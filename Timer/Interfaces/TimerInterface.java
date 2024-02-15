package Timer.Interfaces;


public interface TimerInterface<T> {
    Runnable execAdd(); 
    
    long avgExecTime(Runnable action);
}
