package previous.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CustomPriorityQueue {
    static class Student implements Comparable<Student> {
        String name;
        int marks;

        public Student(String name, int marks) {
            this.name = name;
            this.marks = marks;
        }

        @Override
        public String toString() {
            return "Name : " + name + ", Marks : " + marks;
        }

        @Override
        public int compareTo(Student o) {
            if (this.marks < o.marks){
                return 1;
            }else if (this.marks > o.marks){
                return -1;
            } else {
                return 0;
            }
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Aman", 10);
        Student s2 = new Student("Akshat", 15);
        Student s3 = new Student("Amit", 14);
        Student s4 = new Student("Shad", 12);
        Student s5 = new Student("Rahul", 20);
//        System.out.println(s1);
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);
        pq.add(s5);
        System.out.println(pq.peek());

        // Iterate through priority queue
        Iterator<Student> it =  pq.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
