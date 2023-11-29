package poly.polyObject;

public class polyDetailBJ {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb instanceof BB);//同类 true
        System.out.println(bb instanceof AA);//AA为父类; true
        
        AA aa = new BB();
        System.out.println(aa instanceof AA);// 同类   true
        System.out.println(aa instanceof BB);//BB为AA的子类 ture

        Object object = new Object();
        System.out.println(object instanceof AA);//false  Object不是AA的子类和同类

        String str = "hello";
        System.out.println(str instanceof Object);//str  为Object子类

        Object ob = "Hello";
        String string = (String) ob; //String 为 Object 的子类;
        System.out.println(string);
        
        int in = 5;
        //boolean b = (boolean) in;//boolean 不是 int 的子类

        Object bojPri = new Integer(5);
        //String str1 = (String) bojPri;//错误,指向Integer的父类转成String,编译时不报错,运行时报错;
        Integer str11 = (Integer) bojPri;
        System.out.println(str11);

    }
}

class AA {
}
class BB extends AA{
}