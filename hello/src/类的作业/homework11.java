package 类的作业;

public class homework11 {
    public static void main(String[] args) {
        Circle01 circle01 = new Circle01();
        PassObject print = new PassObject();
        print.printAreas(circle01, 5);
    }
}

class Circle01 {
    double radius;

    // public Circle01() {//无参构造器

    // }
    // public Circle01(double radius) {
    //     this.radius = radius;
    // }

    public double findArea() {
        return Math.PI * radius * radius;
    }
    //添加方法setRadius,修改对象的半径值;
    public void setRadius(double radius) {
        this.radius = radius;
    } 
}

class PassObject {
    public void printAreas(Circle01 circle01, int times) {
        for (int i = 1; i <= times;i++){
            circle01.setRadius(i);   //动态修改c对象的半径值
            System.out.println((double)i + "\t" + circle01.findArea());
        }                                
    }
}