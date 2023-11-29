package Inner;
import Inner.O9.MI;

public class StaticInner {
    public static void main(String[] args) {
        O9 o9 = new O9();
        o9.t1();
        MI G = o9.getMI();
        G.s();
        MI g = new O9().getMI();
        g.s();
        O9 o91 = new O9();
        //O9.MI mi = o91.new MI();
        O9.MI moo = new O9.MI();
    }
}

class O9 {
    private int n1 = 100;
    private String name = "李四";

    static class MI {
        public void s() {
            System.out.println("O9.MI.s");
        }
    }

    public void t1() {
        MI mi = new MI();
        mi.s();
    }

    public MI getMI() {
        return new MI();
    }
}