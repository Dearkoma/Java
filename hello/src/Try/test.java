package Try;
public class test {
    public static void main(String[] args) {
        // A a = new A();
        // a.aa();
        // B b = new B();
        // b.bw();
        // C c = new C();
        // c.cc();
        // T t = new T();
        // t.T1();
        // t.T2();
        SP sp = new SP();
        sp.sp();
        //System.out.println(sp);
    }
}

interface IA {
    public void c();
}

class A {
    public void aa() {
        class ia {
            public void so() {
                System.out.println("A.aa.ia.so");
            }
        }
        ia x = new ia();
         x.so();
    }
}

class IB {
    public void B(){};
}

class B {
    public void bw() {
        class bb {
            public void s() {
                System.out.println("B.bw.s");
            }
        }
        bb x = new bb();
        x.s();
    }
}

class C {
    public void cc() {
        B b = new B() {
            public void bw() {
                System.out.println("C.B.tx()");
            }
        };
        b.bw();
    }
    public void T1() {
        System.out.println("C.C1");
    }
}

class T {
    private int x = 10;
    public void T1() {
        System.out.println("T.T1");
    }

    public void T2() {
        C c = new C() {
            public void T1() {
                System.out.println("T.T2.sT");
            }
        };
        System.out.println(x);
        c.T1();
    }
}

class SP {
    private int bl = 30;

    public void sp() {
        new T() {
            private int b1 = 600;

            public void pp() {
                System.out.println("SP.sp.pp");
            }

            public void sout() {
                System.out.println("SP.sp.b1 :" + b1);  
            }

            public void soutSP() {
                System.out.println("SP.bl :" + SP.this);
            }

            public void T2() {
                super.T2();
            
            }
        }.T2();

    }
}