package Temple.Temple2;

abstract public class Father {
    public abstract void job();

    public void calcTime() {
        long start = System.currentTimeMillis();
        job();//动态绑定;
        long end = System.currentTimeMillis();
        System.out.println("运行时间:" + (end - start));
    }
}
