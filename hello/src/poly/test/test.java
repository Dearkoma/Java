package poly.test;

public class test {
    public static void main(String[] args) {
        A a = new B();
        //a.Info();
        System.out.println(a.Aa());
    }
}

class A {
    public int a = 10;

    public int Aa() {
        return a;
    }

    public void Info() {
        System.out.println("A的info"+ Aa());
    }

}

class B extends A{
    public int a = 100;

    public int Aa() {
        return a;
    }

    // public void Info() {
    //     System.out.println("B的info" + Aa());
    // }
}
