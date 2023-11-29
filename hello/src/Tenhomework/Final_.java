package Tenhomework;

public class Final_ {
    public static void main(String[] args) {
        A a = new A();
        a.F1();
    }
}

class A {
    private String name="加油加油加油";
    public void F1(){
        class B {
            private final String name = "加油补上来";

            public void show() {
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
