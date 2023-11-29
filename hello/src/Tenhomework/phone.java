package Tenhomework;

public class phone {
    public static void main(String[] args) {
        cellPhone cellphone = new cellPhone();
        cellphone.testWork(new calc() {
            public double work(double n1,double n2) {
                return n1+n2;
            }
        }, 10.1, 20);
        cellphone.testWork(new calc() {
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 10, 2);
    }
}

/**
 * work
 */
interface calc {
    public double work(double n1, double n2);
}

class cellPhone {
    public void testWork(calc c, double n1, double n2) {
        double res = c.work(n1, n2);
        System.out.println("结果为:" + res);
    }
}
