package Combinate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        List list2 = new ArrayList();
        List list3 = new ArrayList();
        list.add("jack");
        list.add(10);
        list.add(true);
        list2.add("jack");
        list2.add(10);
        list2.add(true);
        System.out.println(list);
        // //list.remove("jack");
        // //list.remove(0);
        // System.out.println(list);
        // System.out.println(list.contains(10));
        // System.out.println(list.size());
        // //list.clear();
        
        // //System.out.println(list.isEmpty());
        // System.out.println("Used list:"+list);
        // list.addAll(list2);
        // System.out.println("list: \t" + list);
        // list.removeAll(list2);
        // System.out.println(list);
        System.out.println();
        Iterator itor = list.iterator();
        //while (itor.hasNext()) {
        System.out.println(itor.next());//jack
        System.out.println(itor.next());//10
        System.out.println(itor.next());//true
        //}
    }
}
