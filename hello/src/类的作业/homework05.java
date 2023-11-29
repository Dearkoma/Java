package 类的作业;

public class homework05 {
    public static void main(String[] agrs) {
        Circle circle = new Circle(1.1);
        System.out.println("面积:" + circle.area());
        System.out.print("周长:" + circle.l());

    }
}

class Circle {
    double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double l() {
        return 2 * Math.PI * r;
    }
    
}
