package Static;

public class codeblock {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A {
    S s = new S("s1初始化");
    static S s2 = new S("静态");
    static {
        System.out.println("A的static执行");
    }

    A() {
        System.out.println("A的默认调用");
    }
    
}

class S {
    S(String s) {
        System.out.println(s);
    }

    S() {
        System.out.println("默认构造器调用");
    }
}