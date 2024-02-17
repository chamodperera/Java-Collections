# Java Collections Performance Analysis Framework

## Overview

The Java Collections Performance Analysis Framework is a simple customizable tool designed to evaluate the performance of various Java Collection classes.

## Features

- **Customizable:** Users can adjust the collection size and choose specific collections for testing.
- **Supported Collections and Operations:**
  - **Collections:**
    1. ArrayList
    2. LinkedList
    3. HashSet
    4. TreeSet
    5. LinkedHashSet
    6. ArrayDeque
    7. PriorityQueue
    8. HashMap
    9. TreeMap
    10. LinkedHashMap.
  - **Operations:** add, search, remove, clear.

## Getting Started

Ensure Java JDK 8 or later is installed. Clone the repository and navigate to the project directory.

### Running the Tests

Execute the `Main.java` class. The framework generates random data for testing and outputs the results to `data_structure_performance.csv`.

## Code Example

After setting up your environment, you can customize and run performance tests as follows:

```java
ArrayList<Integer> arrayList = new ArrayList<>();
ArrayList<Integer> tempArrayList = new ArrayList<>();

CollectionRandomGenerator generatorArrayList = new CollectionRandomGenerator(100000, 100000, arrayList);
ArrayList<Integer> randomArrayList = (ArrayList<Integer>) generatorArrayList.getObject();
tempArrayList.addAll(randomArrayList);

TimerCollections timerArrayList = new TimerCollections(100000, randomArrayList, tempArrayList);

Long arrayListAddExecTime = timerArrayList.avgExecTime("add");
Long arrayListContainsExecTime = timerArrayList.avgExecTime("contains");
Long arrayListRemoveExecTime = timerArrayList.avgExecTime("remove");
Long arrayListClearExecTime = timerArrayList.avgExecTime("clear");
```

## Results

Results are saved in `Out/data_structure_performance.csv`, with detailed execution times for analysis.

## Contributing

Contributions are welcome. Please submit pull requests or open issues for discussion.
