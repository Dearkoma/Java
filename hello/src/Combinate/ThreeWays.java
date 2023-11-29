package Combinate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ThreeWays {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List list = new ArrayList();
        //List list = new Vector();
        List list = new LinkedList(); 
        list.add(new Booka("红楼梦", "曹雪芹", 100));
        list.add(new Booka("西游记", "吴承恩", 10));
        list.add(new Booka("水浒传", "施耐庵", 9));
        list.add(new Booka("三国演义", "罗贯中", 80));
        list.add(new Booka("西游记", "吴承恩", 10));
        Iterator itor = list.iterator();
        while (itor.hasNext()) {
            System.out.println(itor.next());
        }
        sort(list);
        System.out.println("-------------------------------------");
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
    @SuppressWarnings({"all"})
    protected static void sort(List list) {
        int listsize = list.size();
        for (int i = 0; i < listsize-1; i++) {
            for (int j = 0; j < listsize-i-1; j++) {
                Booka book1 = (Booka) list.get(j);
                Booka book2 = (Booka) list.get(j+1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }

}
