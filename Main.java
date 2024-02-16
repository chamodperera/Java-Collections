import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

import Generator.generators.*;
import Timer.Timers.*;

public class Main {

    public static void main (String args[]){

         //HashSet
         HashSet<Integer> hashSet = new HashSet<Integer>();
         HashSet<Integer> tempHashSet = new HashSet<Integer>();
 
         CollectionRandomGenerator generatorHashSet = new CollectionRandomGenerator(100000, 100000, hashSet);
         HashSet<Integer> randomHashSet = (HashSet<Integer>) generatorHashSet.getObject();
         tempHashSet.addAll(randomHashSet);
 
         TimerCollections timerHashSet = new TimerCollections(100000, randomHashSet,tempHashSet);
 
         Long hashSetAddExecTime = timerHashSet.avgExecTime("add");
         Long hashSetContainsExecTime = timerHashSet.avgExecTime("contains");
         Long hashSetRemoveExecTime = timerHashSet.avgExecTime("remove");
         Long hashSetClearExecTime = timerHashSet.avgExecTime("clear");
 
 
         //TreeSet
         TreeSet<Integer> treeSet = new TreeSet<Integer>();
         TreeSet<Integer> tempTreeSet = new TreeSet<Integer>();
 
         CollectionRandomGenerator generatorTreeSet = new CollectionRandomGenerator(100000, 100000, treeSet);
         TreeSet<Integer> randomTreeSet = (TreeSet<Integer>) generatorTreeSet.getObject();
         tempTreeSet.addAll(randomTreeSet);
 
         TimerCollections timerTreeSet = new TimerCollections(100000, randomTreeSet,tempTreeSet);
 
         Long treeSetAddExecTime = timerTreeSet.avgExecTime("add");
         Long treeSetContainsExecTime = timerTreeSet.avgExecTime("contains");
         Long treeSetRemoveExecTime = timerTreeSet.avgExecTime("remove");
         Long treeSetClearExecTime = timerTreeSet.avgExecTime("clear");
        
        
        //LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
        LinkedHashSet<Integer> tempLinkedHashSet = new LinkedHashSet<Integer>();

        CollectionRandomGenerator generatorLinkedHashSet = new CollectionRandomGenerator(100000, 100000, linkedHashSet);
        LinkedHashSet<Integer> randomLinkedHashSet = (LinkedHashSet<Integer>) generatorLinkedHashSet.getObject();
        tempLinkedHashSet.addAll(randomLinkedHashSet);

        TimerCollections timerLinkedHashSet = new TimerCollections(100000, randomLinkedHashSet,tempLinkedHashSet);

        Long linkedHashSetAddExecTime = timerLinkedHashSet.avgExecTime("add");
        Long linkedHashSetContainsExecTime = timerLinkedHashSet.avgExecTime("contains");
        Long linkedHashSetRemoveExecTime = timerLinkedHashSet.avgExecTime("remove");
        Long linkedHashSetClearExecTime = timerLinkedHashSet.avgExecTime("clear");


        //ArrayList
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        ArrayList<Integer> tempArrayList = new ArrayList<Integer>();

        CollectionRandomGenerator generatorArrayList = new CollectionRandomGenerator(100000, 100000, arrayList);
        ArrayList<Integer> randomArrayList = (ArrayList<Integer>) generatorArrayList.getObject();
        tempArrayList.addAll(randomArrayList);

        TimerCollections timerArrayList = new TimerCollections(100000, randomArrayList,tempArrayList);

        Long arrayListAddExecTime = timerArrayList.avgExecTime("add");
        Long arrayListContainsExecTime = timerArrayList.avgExecTime("contains");
        Long arrayListRemoveExecTime = timerArrayList.avgExecTime("remove");
        Long arrayListClearExecTime = timerArrayList.avgExecTime("clear");


        //LinkedList
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        LinkedList<Integer> tempLinkedList = new LinkedList<Integer>();

        CollectionRandomGenerator generatorLinkedList = new CollectionRandomGenerator(100000, 100000, linkedList);
        LinkedList<Integer> randomLinkedList = (LinkedList<Integer>) generatorLinkedList.getObject();
        tempLinkedList.addAll(randomLinkedList);

        TimerCollections timerLinkedList = new TimerCollections(100000, randomLinkedList,tempLinkedList);

        Long linkedListAddExecTime = timerLinkedList.avgExecTime("add");
        Long linkedListContainsExecTime = timerLinkedList.avgExecTime("contains");
        Long linkedListRemoveExecTime = timerLinkedList.avgExecTime("remove");
        Long linkedListClearExecTime = timerLinkedList.avgExecTime("clear");


        //ArrayDeque
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
        ArrayDeque<Integer> tempArrayDeque = new ArrayDeque<Integer>();

        CollectionRandomGenerator generatorArrayDeque = new CollectionRandomGenerator(100000, 100000, arrayDeque);
        ArrayDeque<Integer> randomArrayDeque = (ArrayDeque<Integer>) generatorArrayDeque.getObject();
        tempArrayDeque.addAll(randomArrayDeque);

        TimerCollections timerArrayDeque = new TimerCollections(100000, randomArrayDeque,tempArrayDeque);

        Long arrayDequeAddExecTime = timerArrayDeque.avgExecTime("add");
        Long arrayDequeContainsExecTime = timerArrayDeque.avgExecTime("contains");
        Long arrayDequeRemoveExecTime = timerArrayDeque.avgExecTime("remove");
        Long arrayDequeClearExecTime = timerArrayDeque.avgExecTime("clear");


        //PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        PriorityQueue<Integer> tempPriorityQueue = new PriorityQueue<Integer>();

        CollectionRandomGenerator generatorPriorityQueue = new CollectionRandomGenerator(100000, 100000, priorityQueue);
        PriorityQueue<Integer> randomPriorityQueue = (PriorityQueue<Integer>) generatorPriorityQueue.getObject();
        tempPriorityQueue.addAll(randomPriorityQueue);

        TimerCollections timerPriorityQueue = new TimerCollections(100000, randomPriorityQueue,tempPriorityQueue);

        Long priorityQueueAddExecTime = timerPriorityQueue.avgExecTime("add");
        Long priorityQueueContainsExecTime = timerPriorityQueue.avgExecTime("contains");
        Long priorityQueueRemoveExecTime = timerPriorityQueue.avgExecTime("remove");
        Long priorityQueueClearExecTime = timerPriorityQueue.avgExecTime("clear");


        //HashMap
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> tempHashMap = new HashMap<Integer, Integer>();

        MapRandomGenerator generatorHashMap = new MapRandomGenerator(100000, 100000, hashMap);
        HashMap<Integer, Integer> randomHashMap = (HashMap<Integer, Integer>) generatorHashMap.getObject();
        tempHashMap.putAll(randomHashMap);

        TimerMaps timerHashMap = new TimerMaps(100000, randomHashMap,tempHashMap);

        Long hashMapAddExecTime = timerHashMap.avgExecTime("add");
        Long hashMapContainsExecTime = timerHashMap.avgExecTime("contains");
        Long hashMapRemoveExecTime = timerHashMap.avgExecTime("remove");
        Long hashMapClearExecTime = timerHashMap.avgExecTime("clear");


        //TreeMap
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        TreeMap<Integer, Integer> tempTreeMap = new TreeMap<Integer, Integer>();

        MapRandomGenerator generatorTreeMap = new MapRandomGenerator(100000, 100000, treeMap);
        TreeMap<Integer, Integer> randomTreeMap = (TreeMap<Integer, Integer>) generatorTreeMap.getObject();
        tempTreeMap.putAll(randomTreeMap);

        TimerMaps timerTreeMap = new TimerMaps(100000, randomTreeMap,tempTreeMap);

        Long treeMapAddExecTime = timerTreeMap.avgExecTime("add");
        Long treeMapContainsExecTime = timerTreeMap.avgExecTime("contains");
        Long treeMapRemoveExecTime = timerTreeMap.avgExecTime("remove");
        Long treeMapClearExecTime = timerTreeMap.avgExecTime("clear");


        //LinkedHashMap
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        LinkedHashMap<Integer, Integer> tempLinkedHashMap = new LinkedHashMap<Integer, Integer>();

        MapRandomGenerator generatorLinkedHashMap = new MapRandomGenerator(100000, 100000, linkedHashMap);
        LinkedHashMap<Integer, Integer> randomLinkedHashMap = (LinkedHashMap<Integer, Integer>) generatorLinkedHashMap.getObject();
        tempLinkedHashMap.putAll(randomLinkedHashMap);

        TimerMaps timerLinkedHashMap = new TimerMaps(100000, randomLinkedHashMap,tempLinkedHashMap);

        Long linkedHashMapAddExecTime = timerLinkedHashMap.avgExecTime("add");
        Long linkedHashMapContainsExecTime = timerLinkedHashMap.avgExecTime("contains");
        Long linkedHashMapRemoveExecTime = timerLinkedHashMap.avgExecTime("remove");
        Long linkedHashMapClearExecTime = timerLinkedHashMap.avgExecTime("clear");


        System.out.println("ArrayList");
        System.out.println("Add: " + arrayListAddExecTime);
        System.out.println("Contains: " + arrayListContainsExecTime);
        System.out.println("Remove: " + arrayListRemoveExecTime);
        System.out.println("Clear: " + arrayListClearExecTime);
        System.out.println("");

        System.out.println("LinkedList");
        System.out.println("Add: " + linkedListAddExecTime);
        System.out.println("Contains: " + linkedListContainsExecTime);
        System.out.println("Remove: " + linkedListRemoveExecTime);
        System.out.println("Clear: " + linkedListClearExecTime);
        System.out.println("");

        System.out.println("HashSet");
        System.out.println("Add: " + hashSetAddExecTime);
        System.out.println("Contains: " + hashSetContainsExecTime);
        System.out.println("Remove: " + hashSetRemoveExecTime);
        System.out.println("Clear: " + hashSetClearExecTime);
        System.out.println("");
        
        System.out.println("TreeSet");
        System.out.println("Add: " + treeSetAddExecTime);
        System.out.println("Contains: " + treeSetContainsExecTime);
        System.out.println("Remove: " + treeSetRemoveExecTime);
        System.out.println("Clear: " + treeSetClearExecTime);
        System.out.println("");

        System.out.println("LinkedHashSet");
        System.out.println("Add: " + linkedHashSetAddExecTime);
        System.out.println("Contains: " + linkedHashSetContainsExecTime);
        System.out.println("Remove: " + linkedHashSetRemoveExecTime);
        System.out.println("Clear: " + linkedHashSetClearExecTime);
        System.out.println("");

        System.out.println("ArrayDeque");
        System.out.println("Add: " + arrayDequeAddExecTime);
        System.out.println("Contains: " + arrayDequeContainsExecTime);
        System.out.println("Remove: " + arrayDequeRemoveExecTime);
        System.out.println("Clear: " + arrayDequeClearExecTime);
        System.out.println("");

        System.out.println("PriorityQueue");
        System.out.println("Add: " + priorityQueueAddExecTime);
        System.out.println("Contains: " + priorityQueueContainsExecTime);
        System.out.println("Remove: " + priorityQueueRemoveExecTime);
        System.out.println("Clear: " + priorityQueueClearExecTime);
        System.out.println("");

        System.out.println("HashMap");
        System.out.println("Add: " + hashMapAddExecTime);
        System.out.println("Contains: " + hashMapContainsExecTime);
        System.out.println("Remove: " + hashMapRemoveExecTime);
        System.out.println("Clear: " + hashMapClearExecTime);
        System.out.println("");

        System.out.println("TreeMap");
        System.out.println("Add: " + treeMapAddExecTime);
        System.out.println("Contains: " + treeMapContainsExecTime);
        System.out.println("Remove: " + treeMapRemoveExecTime);
        System.out.println("Clear: " + treeMapClearExecTime);
        System.out.println("");

        System.out.println("LinkedHashMap");
        System.out.println("Add: " + linkedHashMapAddExecTime);
        System.out.println("Contains: " + linkedHashMapContainsExecTime);
        System.out.println("Remove: " + linkedHashMapRemoveExecTime);
        System.out.println("Clear: " + linkedHashMapClearExecTime);
        System.out.println("");
    

        }

}