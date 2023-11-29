package Inner;

public class AnonymousInner {
    public static void main(String[] args) {
        O4 o4 = new O4();
        o4.method();
    }

}

class O4 {
    private int n1 = 10;

    public void method() {
        A t = new A() {
            public void cry() {
                System.out.println("t叫唤");
            }
        };
        t.cry();//别忘了,调用,上面只是重写;
        System.out.println("O4.t" + t.getClass());
        Father father = new Father("jack") {
            //不存在构造器
            public void test() {
                System.out.println("O4的father的test()方法(匿名类内部重写test方法)");
            }
        };
        System.out.println("father运行类型为"+father.getClass());
        father.test();
    }
}

interface A {
    public void cry();
}

class Father {
    public Father(String name) {
        super();
    }
    public void test() {
    }
}