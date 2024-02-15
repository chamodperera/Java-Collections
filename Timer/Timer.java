package Timer;

import java.util.function.Supplier;

import Timer.Interfaces.TimerInterface;

public abstract class Timer<T> implements TimerInterface<T> {
    protected int range;
    protected int avg; // get the number of times the action is executed and return the average time

    public Timer(int range){
        this.range = range;
        this.avg = 100;
    }

    public long avgExecTime(Supplier<Long> action) {
        long execTime = 0;
        for (int i = 0; i < this.avg; i++) {
            Long time = action.get();
            execTime += time;
        }
        return execTime / this.avg;
    }
}
