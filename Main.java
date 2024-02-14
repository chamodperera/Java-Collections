import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import Generator.generators.*;
import Timer.Timers.TimerCollections;

public class Main {

    public static void main (String args[]){
        HashSet<Integer> test = new HashSet<Integer>();
        CollectionRandomGenerator random = new CollectionRandomGenerator(100000, 100000, test);
        HashSet<Integer> randomSet = (HashSet<Integer>) random.getObject();
        System.out.println(randomSet);

        // TimerCollections timer = new TimerCollections(100, randomSet);
        // System.out.println(timer.getTime(timer.add()));

        }

}