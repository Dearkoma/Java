package Map_;

import java.util.Properties;

public class Properties_{
    public static void main(String[] args) {
        Properties pro =new Properties();
        pro.put("1",1);
        pro.put("2",2);
        pro.put("3",3);
        System.out.println(pro);
        pro.put("1",11);
        System.out.println(pro);
    }
}
