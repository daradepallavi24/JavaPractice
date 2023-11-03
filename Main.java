package com.thread.demo;

/*The ProducerConsumer class contains a shared buffer implemented as a LinkedList and a capacity that specifies the maximum number of items the buffer can hold.
 * The produce method simulates a producer. It runs in an infinite loop and tries to add items to the buffer while ensuring that the buffer is not full. 
 * If the buffer is full, the producer thread waits until the consumer consumes some items and notifies it.
 *  After adding an item, it notifies the consumer and simulates some work with Thread.sleep.
 * The consume method simulates a consumer. It also runs in an infinite loop and tries to remove items from the buffer while ensuring that the buffer is not empty. 
 * If the buffer is empty, the consumer thread waits until the producer produces some items and notifies it. 
 * After consuming an item, it notifies the producer and simulates some work with Thread.sleep.
 * In the Main class, two threads are created: one for the producer and one for the consumer.
 * The producer thread runs the pc.produce() method, and the consumer thread runs the pc.consume() method.
 * Both producer and consumer threads run indefinitely, simulating the production and consumption of items in the shared buffer.
 * synchronized blocks are used to ensure that only one thread (producer or consumer) can access the shared buffer at a time, preventing race conditions.*/

import java.util.LinkedList;

class ProducerConsumer {
    private LinkedList<Integer> buffer = new LinkedList<>();
    private int capacity = 5;

    public void produce() throws InterruptedException {
        int item = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    System.out.println("Buffer is full. Producer is waiting...");
                    wait();
                }

                System.out.println("Producer produced: " + item);
                buffer.add(item++);
                notify();
                Thread.sleep(1000); // Simulate some work
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    System.out.println("Buffer is empty. Consumer is waiting...");
                    wait();
                }

                int consumedItem = buffer.removeFirst();
                System.out.println("Consumer consumed: " + consumedItem);
                notify();
                Thread.sleep(1000); // Simulate some work
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}

