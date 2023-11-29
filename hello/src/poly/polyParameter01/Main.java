package poly.polyParameter01;

public class Main {
    public static void main(String[] args) {
        Manager t = new Manager("t", 2000, 20000);
        Worker w = new Worker("w", 10000);
        Main a = new Main();
        a.showEA(t);
        a.showEA(w);
        a.teseW(t);
        a.teseW(w);

    }

    public void showEA(Employee e) {
        System.out.println(e.getAnnual());
    }

    public void teseW(Employee e) {
        if (e instanceof Worker) {
            ((Worker)e).work();
        } else if (e instanceof Manager) {
            ((Manager)e).manager();
        }else {
            System.out.println("是不是本公司的人");
        }       
    }
}
