package com.epam.collections.queue;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.addAll(firstList);
        queue.addAll(secondList);
        return queue;
    }
}
