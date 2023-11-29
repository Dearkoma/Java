package Inner;

import Inner.M01.MI;

public class MI01 {
    public static void main(String[] args) {
        M01 m01 = new M01();
        M01.MI mi = m01.new MI();
        // MI m02 = new M01().getM01();
        // m02.say();
        // M01.MI m012 = m01.getM01();
        // m012.say();
        MI mii = new M01().getM01();
        mii.say();
    }
}

class M01 {
    private int n1 = 10;
    private String name = "张三";

    class MI {
        
        public void say() {
        
            System.out.println("n1  " + n1 + "name  " + name);
        }
    }

    public MI getM01() {
        return new MI();
    }
    
}
