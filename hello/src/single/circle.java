package single;

public class circle {
        public static void main(String[] args) {
            cc c = new cc(3);
            System.out.println(c.Pi);
            
        }
}

class cc {
    public  double radius;
    public final double Pi;// = 3.14;

    public cc(double radius) {
        Pi = 3.14;
        this.radius = radius;
    }

    {
        //Pi = 3.14;
    }

}
