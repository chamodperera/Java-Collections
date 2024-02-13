import java.util.HashMap;

public class Main {

    public static void main (String args[]){
        HashMap<String, Integer> test = new HashMap<String, Integer>();
        RandomGenerator random = new RandomGenerator(10, 1000, test);
        System.out.println(random.getObject());
        }

}