package 类的作业;

public class homework06 {
    public static void main(String[] args) {
        Cale cale = new Cale(2, 4);
        System.out.println("和:" + cale.sum());
        System.out.println("差:" + cale.minus());
        System.out.println("乘:" + cale.mul());
        Double diver=cale.div();
        if (diver != null) {
        System.out.println("除:" + cale.div());    
        }
    }
}

class Cale {
    double a;
    double b;

    public Cale(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double sum() {
        return a + b;
    }

    public double minus() {
        return a - b;
    }

    public double mul() {
        return a * b;
    }

    public Double div() {
        if (b == 0) {
            System.out.print("除数不能为0");
            return null;
        }
        return a / b;
    }
}
