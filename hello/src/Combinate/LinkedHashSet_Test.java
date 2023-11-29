package Combinate;

import java.util.LinkedHashSet;
import java.util.Set;
public class LinkedHashSet_Test {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Set set = new LinkedHashSet();
        set.add(new String("六点"));
        set.add(456);
        set.add(456);
        set.add(new String("刘"));
        set.add(123);
        set.add("HSP");
        System.out.println(set);
    }
}
