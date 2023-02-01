package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DishOrderDeterminer {
    public static void main(String[] args) {
        for (Integer integer : determineDishOrder(10, 3)) {
            System.out.println(integer);
        }
    }
    public static List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }
        int index = 0;
        while (!queue.isEmpty()) {
            index = (index + everyDishNumberToEat - 1) % queue.size();
            result.add(queue.remove(index));
        }
        return result;
    }
}
