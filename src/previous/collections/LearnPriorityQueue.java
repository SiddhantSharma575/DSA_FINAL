package previous.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.add(10);
//        pq.add(20);
//        pq.add(30);
//        System.out.println(pq);
//
//        System.out.println(pq.peek());
//        pq.poll();
//        System.out.println(pq.peek());

        // Max Priority Queue
        PriorityQueue<Integer> mq = new PriorityQueue<>(Collections.reverseOrder());
        mq.add(20);
        mq.add(40);
        mq.add(60);
        System.out.println(mq.peek());

        // Max Priority Queue Method 2 using custom Comparator
        PriorityQueue<Integer> mq1  = new PriorityQueue<>(
                new Comparator<Integer>() {
                    @Override
                    public int compare(Integer a, Integer b) {
                        if (a < b) {
                            return 1;
                        }else if (a > b){
                            return -1;
                        }else {
                            return 0;
                        }
                    }
                }
        );

        mq1.add(10);
        mq1.add(20);
        mq1.add(30);
        System.out.println(mq1.peek());

        // Method3 : Using Lambda
        PriorityQueue<Integer> mq3 = new PriorityQueue<>((a,b) -> b-a);


    }
}
