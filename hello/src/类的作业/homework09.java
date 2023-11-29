package 类的作业;

//P260无法使用构造器?System.out.print(method.Sum(method.Sum(10.1,20.1),30.1));在不报任何错误情况
public class homework09 {
    public static void main(String[] args) {
        Method method = new Method();
        System.out.println(method.Sum(method.Sum(10.1,20.1),30.1));
    }
}

class Method {
    double a;
    double d;

    // public Method(double a, double d) {
    //     this.a = a;
    //     this.d = d;
    // }

    public double Sum(double a,double d) {
        return a + d;
    }
    
}