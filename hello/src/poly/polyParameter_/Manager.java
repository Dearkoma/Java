package poly.polyParameter_;

public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double bonus,double salary) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void manager() {
        System.out.println("经理:" + getName() + " is managing");
    }

    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
