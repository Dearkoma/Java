package poly.polyParameter_;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 2000);
        Manager milan = new Manager("milan", 500, 20000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(tom);
        polyParameter.showEmpAnnual(milan);
        polyParameter.testWork(tom);
        polyParameter.testWork(milan);
    }

    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manager();
        } else {
            System.out.println("不是公司的人...");
        }
    }
}
