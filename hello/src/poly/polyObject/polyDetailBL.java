package poly.polyObject;

public class polyDetailBL {
    public static void main(String[] args) {
        Base base = new Sub();
        base.AAA();
        base.AAA1();
        //System.out.println(base.count);//因为编译类型为Base 所以先从Base里找类似于方法,会先从编译类型里得到属性,运行时再看是否Sub里有无;
    }
}

class Base {
    int count = 10;

    public void AAA() {
        System.out.println("Baes的AAA");
    }

    public void AAA1() {
        System.out.println("Base的AAA1 1 1");
    }
}

class Sub extends Base{
    int count = 20;

    public void AAA(){
        System.out.println("Sub的AAA");
    }
}
