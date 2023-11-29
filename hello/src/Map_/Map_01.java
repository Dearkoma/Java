package Map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_01 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("n01", "Hsp");
        map.put("n02", "zhangshanfeng");
        map.put("n03", "liuweilin");
        map.put("d", map);
        map.put("ff", map);
        Set set = map.entrySet();
        System.out.println(set.getClass());
        for (Object entry : set) {
            System.out.println(entry.getClass());
        }
        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());
        System.out.println("\n\n==============================");
        System.out.println("Values " + map.values());
        System.out.println();
        System.out.println("keySet " + map.keySet());
        System.out.println();
        Set sse = map.keySet();// 得到map所有的key
        for (Object obj : sse) {
            System.out.println(obj + "-" + map.get(obj));
        }
        System.out.println("entrySet " + map.entrySet());
        System.out.println("\n\n\n\n\n============================");
        Collection col = map.values();
        for (Object obj : col) {
            System.out.println(obj);
        }
        //通过EntrySet来获取k-v
        System.out.println("Ways 3:");
        Set col1 = map.entrySet();//EntrySet<Map.Entry<k,v>>
        for (Object obj : col1) {
            Map.Entry m = (Map.Entry) obj;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}