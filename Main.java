import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import Generator.generators.*;

public class Main {

    public static void main (String args[]){
        HashSet<Integer> test = new HashSet<Integer>();
        SetRandomGenerator random = new SetRandomGenerator(10, 100, test);
        System.out.println(random.getObject());
        }

}