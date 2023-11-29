package Inner;

public class ICE01 {
    public static void main(String[] args) {
        f1(new Il() {
            public void show() {
                System.out.println("接口在主类实现方法并直接使用");
            }
        });
        f1(new X());
    }

    public static void f1(Il i){
        i.show();
    }
}

/**
 * InnerICE
 */
interface Il {
    public void show();
}
class X implements Il{
    public void show() {
        System.out.println("X的Il使用");
    }
}