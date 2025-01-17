package Collections;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[]){
        /*
        In Collection it is a SubInterface of Iterable. Iterable is the SuperInterface of Collection.
        In collection it consist of three sections
        1.List -->(ArrayList,LinkedList,Vector,Stack)
        2.Queue -->(Priority queue, ArrayQueue)
        3.Set -->(Hashset,LinkedHashSet,SortedSet,TreeSet)

        1.List
            *ArrayList

            ArrayList is resizable.a
            Heterogenous objects are allowed.
            the values are stored in a objects of datatype like Integer.value.
            DataStructure: Growable Array



         */

        ArrayList al = new ArrayList();

        al.add(10);
        al.add("hello");
        al.add(12.50f);
        al.add('s');

        System.out.println(al.size());
        System.out.println(al.add("java"));
        System.out.println(al.get(1));
        System.out.println(al.getClass());
        System.out.println(al.getFirst()+" "+al.getLast());
        al.set(3,'A');
        al.add(2,"Siva");
        System.out.println(al.contains(12.50));
        System.out.println(al.remove(2));
        System.out.println(al.contains("hello"));
        System.out.println(al.hashCode());
        System.out.println(al.isEmpty());
        System.out.println(al.clone());
        System.out.println(al);
        System.out.println(al.size());

    }
}
