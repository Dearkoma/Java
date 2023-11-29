package Temple.Temple1;

public class BB {
    public void calc1() {
        long start = System.currentTimeMillis();
        A a = new A();
        a.job();
        long end = System.currentTimeMillis();
        System.out.println("运行时间:" + (end - start));
    }
    public void calc2() {
        long start = System.currentTimeMillis();
        A a = new A();
        a.job();
        long end = System.currentTimeMillis();
        System.out.println("运行时间:" + (end - start));
    }
}
    