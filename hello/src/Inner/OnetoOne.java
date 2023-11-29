package Inner;

public class OnetoOne {
    public static void main(String[] args) {
        AAA a=new AAA();
        a.S(new IAAA() {
            public void S() {
                System.out.println("起床");
            }
            public void x() {
                System.out.println("6");
            }
        });
        
        a.x(new IAAA() {
            public void S(){
                System.out.println("上课");
            }
            public void x() {
                System.out.println("6");
            }
        });
    }
}
interface IAAA {
       void S();
       void x();
}
class AAA {
    public void S(IAAA ia) {
        ia.S();
        ia.x();
    }

    public void x(IAAA ia) {
        ia.S();
        ia.x();
    }
}
    