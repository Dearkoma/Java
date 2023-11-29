package 学习.Test注意继承时的构造器调用;

public class 继承 extends 子类 {
    public static void main(String[] args) {
        //子类 z = new 子类();
        //System.out.println(new 子类());
        //z.sum();
        new 继承();
    }

    public 继承() {
        this.F1();
        System.out.println("666");
    }
}
