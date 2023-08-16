package current.collect;

import java.util.*;

public class QueueStackLearn {
    public static class StudentMarks implements Comparable<StudentMarks> {
        private int maths;
        private int physics;

        public StudentMarks(int maths, int physics) {
            this.maths = maths;
            this.physics = physics;
        }

        public int getMaths() {
            return maths;
        }

        public int getPhysics() {
            return physics;
        }

        @Override
        public String toString() {
            return "StudentMarks{" +
                    "maths=" + maths +
                    ", physics=" + physics +
                    '}';
        }

        @Override
        public int compareTo(StudentMarks o) {
//            current object < other object return -1;
//            current object > other object return 1
//              curent object == other object return 0

//            if (this.maths < o.maths) {
//                return -1;
//            }
//            if (this.maths > o.maths) {
//                return 1;
//            }
//            return 0;
            return o.maths - this.maths;
        }
    }
    public static void main(String[] args) {
        // FIFO queue
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(1);
//        queue.offer(2);
//        System.out.println(queue.peek());
//        queue.poll();
//        System.out.println(queue.peek());
//        System.out.println(queue.isEmpty());


        // Stack
//        Stack<Integer> stack = new Stack<>();
//        stack.push(1);
//        stack.push(2);
//        while (!stack.isEmpty()){
//            System.out.println(stack.peek());
//            stack.pop();
//        }


        // DEQUE
//        Deque<Integer> deq = new ArrayDeque<>();
//        deq.offerFirst(1);
//        deq.offerFirst(2);
//        System.out.println(deq.peek());

        // Priority Queue

//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(0);
//        pq.offer(100);
//        List<Integer> tp2 = new ArrayList<>();
//        int index = 0;
//        while (!pq.isEmpty()) {
//            if (index == 2)
//                break;
//            tp2.add(pq.poll());
//            index++;
//        }
//        System.out.println(tp2);
//        System.out.println(pq);

        // get me the top 3 students according to maths marks
        List<StudentMarks> marks = new ArrayList<>();
        marks.add(new StudentMarks(70,80));
        marks.add(new StudentMarks(38,10));
        marks.add(new StudentMarks(100,38));
        marks.add(new StudentMarks(40,88));
        marks.add(new StudentMarks(97,19));

        PriorityQueue<StudentMarks> st = new PriorityQueue<>(marks);
        List<StudentMarks> tp3 = new ArrayList<>();
        int index = 0;
        while (!st.isEmpty()) {
            if (index == 3)
                break;
            tp3.add(st.poll());
            index++;
        }
//        System.out.println(tp3);

        // comparator
//        PriorityQueue<Integer> custpq = new PriorityQueue<>(new MyCustomComparator());
//          using lambda
        PriorityQueue<Integer> custpq = new PriorityQueue<>((a,b) -> b - a);
        custpq.offer(1);
        custpq.offer(2);
        custpq.offer(0);
        custpq.offer(100);
        List<Integer> bottom2 = new ArrayList<>();
        int idx = 0;
        while (!custpq.isEmpty()) {
            if (idx == 2)
                break;
            bottom2.add(custpq.poll());
            idx++;
        }
        System.out.println(bottom2);

    }

    public static class MyCustomComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
}
