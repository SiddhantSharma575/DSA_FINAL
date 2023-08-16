package current.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Basic {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        System.out.println(alist);

        Integer[] arr = alist.toArray(new Integer[0]);
        for (int x : arr) {
            System.out.print(x + " ");
        }

        // change a element
        alist.set(1,5);
        System.out.println(alist);

        List<Integer> alist2 = new ArrayList<>();
        alist2.add(4);
        alist2.add(5);
        alist2.add(6);
        alist2.addAll(alist);
        System.out.println(alist2);


        List<Integer> alist3 = alist2.subList(1,4);
        System.out.println(alist3);
        // but it stores shallow copy of parent if anything changes in child
        // also reflect in parent
        List<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ListIterator<Integer> lliterator = ll.listIterator();
        System.out.println(lliterator.next());
        System.out.println(lliterator.next());
        System.out.println(lliterator.previous());
    }
}
