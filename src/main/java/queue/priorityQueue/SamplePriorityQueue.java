package queue.priorityQueue;

import java.util.PriorityQueue;

public class SamplePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> strings = new PriorityQueue<>(15,new MyComparator());
        strings.add("Tyrion Lannister");
        strings.add("Daenerys Targaryen");
        strings.add("Arya Stark");
        strings.add("Petyr 'Littlefinger' Baelish");

        while (strings.size() != 0)
        {
            System.out.println(strings.poll());

        }
    }
}
