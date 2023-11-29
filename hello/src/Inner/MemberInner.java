package Inner;

public class MemberInner {
    public static void main(String[] args) {
        O8 o8 = new O8();
        o8.t1();
    }
}

class O8 {
    private int n1 = 10;
    private String name = "张三";

    class MI {
        public void say() {
            System.out.println("n1  " + n1 + "name     " + name);
        }
    }

    public void t1(){
        MI mi = new MI();
        mi.say();
    }
}
