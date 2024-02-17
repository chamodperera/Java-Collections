package Timer;

import Timer.Interfaces.TimerInterface;

public abstract class Timer<T> implements TimerInterface<T> {
    protected int range;
    protected int avg; // get the number of times the action is executed and return the average time

    public Timer(int range){
        this.range = range;
        this.avg = 100;
    }

    @Override
    public long avgExecTime(String action) {
        long execTime = 0;
        for (int i = 0; i < this.avg; i++) {
            switch(action){
                case "add":
                    execTime += this.execAdd();
                    break;
                case "contains":
                    execTime += this.execContains();
                    break;
                case "remove":
                    execTime += this.execRemove();
                    break;
                case "clear":
                    execTime += this.execClear();
                    break;
            }
        }
        return execTime / this.avg;
    }
}
