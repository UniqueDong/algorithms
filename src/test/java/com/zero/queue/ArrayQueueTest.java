package com.zero.queue;

import com.zero.algorithms.linear.queue.ArrayQueue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("数组队列测试")
public class ArrayQueueTest {

    @DisplayName("出队与入队操作测试")
    @Test
    public void test() {
        ArrayQueue<String> circleQueue = new ArrayQueue<>(String.class, 8);
        System.out.println("circleQueue capacity = " + circleQueue.capacity());
        int i = 1;
        while (!circleQueue.isFull()) {
            circleQueue.enqueue("S" + (i++));
        }
        while (!circleQueue.isEmpty()) {
            System.out.println(circleQueue.dequeue());
        }
    }
}
