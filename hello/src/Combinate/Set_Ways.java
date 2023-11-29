package Combinate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Set_Ways {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("Jack");
        set.add("tom");
        set.add("Jack");
        set.add("Jack");
        set.add("Jack");
        System.out.println(set.size());
        Iterator itor = set.iterator();
        while (itor.hasNext()) {
            System.out.println(itor.next());
        }
    }
}
