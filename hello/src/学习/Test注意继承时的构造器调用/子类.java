package 学习.Test注意继承时的构造器调用;

public class 子类 extends 父类 {
    public void A() {
        System.out.println("子类的A被调用");
    }

    public void F1() {
        System.out.println("子类的F1");
    }
    // public 子类() {
    //     //System.out.println("子类的继承()");
    // }
    
    // public void F1() {
    //     System.out.println("子类的F1()调用");
    // }
    

    public void sum() {
        //System.out.println("B 类的sum()");
        // 子类没有父类的shownJ,但是有三种方式调用shownj
        // 找shownJ的顺序是,先本类,如果有并且可以调用,就调用,不然就以此向上找父类(整个规则一直这样保持)
        // 如果找到了但是不能调用就报错,没有找到就提示方法不存在
        // A();
        // this.A(); //A();就近调用
        // 直接查找父类
        // super.A();//本类有A也不调用直接查找父类,其他规则一样;
        //super.父类();
        //因为是super所以父类的构造器也被调用
        super.F1();
    }

    
}
