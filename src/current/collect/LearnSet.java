package current.collect;

import java.util.*;

public class LearnSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(0);
        System.out.println(set);
        // hashset doesn't maintain the order
        Set<Integer> set3 = new LinkedHashSet<>();
        set3.add(2);
        set3.add(3);
        set3.add(4);
        set3.add(2);
        set3.add(0);
        System.out.println(set3);
        // Treeset
        Set<QueueStackLearn.StudentMarks> treeset = new TreeSet<>((s1, s2) -> s2.getPhysics() - s1.getPhysics());
        treeset.add(new QueueStackLearn.StudentMarks(70,80));
        treeset.add(new QueueStackLearn.StudentMarks(38,10));
        treeset.add(new QueueStackLearn.StudentMarks(100,38));
        treeset.add(new QueueStackLearn.StudentMarks(40,88));
        treeset.add(new QueueStackLearn.StudentMarks(97,19));
//        for (QueueStackLearn.StudentMarks x : treeset) {
//            System.out.println(x + " ");
//        }

        NavigableSet<Integer> set5  = new TreeSet<>();
        set5.add(8);
        set5.add(3);
        set5.add(1);
        set5.add(0);
        for (int x : set5)
            System.out.println(x + " ");
        System.out.println(set5.floor(5));
        System.out.println(set5.ceiling(2));
    }
}
